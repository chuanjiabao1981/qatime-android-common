package libraryextra.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Files;
import android.provider.MediaStore.Files.FileColumns;

import com.orhanobut.logger.Logger;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author luntify
 * @date 2016/8/12 10:07
 * @Description
 */
public class FileUtil {

    /**
     * 获取指定类型的文件
     *
     * @param context
     * @param extension
     */
    public static List<File> getSpecificTypeOfFile(Context context, String[] extension) {
        List<File> list = new ArrayList<>();
        if (context == null) {
            return list;
        }
        //从外存中获取
        Uri fileUri = Files.getContentUri("external");
        //筛选列，这里只筛选了：文件路径和不含后缀的文件名
        String[] projection = new String[]{
                FileColumns.DATA, FileColumns.TITLE
        };
        //构造筛选语句
        String selection = "";
        for (int i = 0; i < extension.length; i++) {
            if (i != 0) {
                selection = selection + " OR ";
            }
            selection = selection + FileColumns.DATA + " LIKE '%." + extension[i] + "'";
        }
        //按时间递增顺序对结果进行排序;待会从后往前移动游标就可实现时间递减
        String sortOrder = FileColumns.DATE_MODIFIED;
        //获取内容解析器对象
        ContentResolver resolver = context.getContentResolver();
        //获取游标
        Cursor cursor = resolver.query(fileUri, projection, selection, null, sortOrder);
        if (cursor != null) {
            //游标从最后开始往前递减，以此实现时间递减顺序（最近访问的文件，优先显示）
            if (cursor.moveToLast()) {
                do {
                    //输出文件的完整路径
                    String data = cursor.getString(0);

                    File file = new File(data);
                    if (file.exists() && !file.isHidden() && file.canRead()) {
                        list.add(file);
                    }
                } while (cursor.moveToPrevious());
            }
            cursor.close();
        }
        return list;
    }

    /**
     * 把数据写入文�?
     *
     * @param is       数据�?
     * @param path     文件路径
     * @param recreate 如果文件存在，是否需要删除重�?
     * @return 是否写入成功
     */
    public static boolean writeFile(InputStream is, String path, boolean recreate) {
        boolean res = false;
        File f = new File(path);
        FileOutputStream fos = null;
        try {
            if (recreate && f.exists()) {
                f.delete();
            }
            if (!f.exists() && null != is) {
                File parentFile = new File(f.getParent());
                parentFile.mkdirs();
                int count = -1;
                byte[] buffer = new byte[1024];
                fos = new FileOutputStream(f);
                while ((count = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, count);
                }
                res = true;
            }
        } catch (Exception e) {
            Logger.e(e);
        } finally {
            try {
                fos.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return res;
    }

    public static byte[] File2byte(String filePath) {
        byte[] buffer = null;
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }

    public static String readFile(String path) {
        FileInputStream inStream = null;
        try {
            inStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "";
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] buffer = new byte[1024];

        int length = -1;

        try {
            while ((length = inStream.read(buffer)) != -1) {
                bos.write(buffer, 0, length);
            }
            bos.close();
            inStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bos.toString();
    }
}
