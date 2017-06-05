package libraryextra.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;

import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 跟网络相关的工具类
 */
public class NetUtils {
    private NetUtils() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 判断网络是否连接
     *
     * @param context
     * @return
     */
    public static boolean isConnected(Context context) {

        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        if (null != connectivity) {

            NetworkInfo info = connectivity.getActiveNetworkInfo();
            if (null != info && info.isConnected()) {
                if (info.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 判断是否是wifi连接
     */
    public static boolean isWifi(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm != null && cm.getActiveNetworkInfo().getType() == ConnectivityManager.TYPE_WIFI;

    }

    /**
     * 判断是否是移动连接
     */
    public static boolean isMobile(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm != null && cm.getActiveNetworkInfo().getType() == ConnectivityManager.TYPE_MOBILE;

    }

    /**
     * 打开网络设置界面
     */
    public static void openSetting(Activity activity) {
        Intent intent = new Intent("/");
        ComponentName cm = new ComponentName("com.android.settings",
                "com.android.settings.WirelessSettings");
        intent.setComponent(cm);
        intent.setAction("android.intent.action.VIEW");
        activity.startActivityForResult(intent, PackageManager.PERMISSION_GRANTED);
    }

    public static boolean checkRecordAudioPermission(Context context) {
        return context.checkPermission("android.permission.RECORD_AUDIO", Process.myPid(), Process.myUid()) == PackageManager.PERMISSION_GRANTED;
    }

    public static List<String> checkPermission(Context context) {
        ArrayList<String> list = new ArrayList<>();
        if (!checkRecordAudioPermission(context)) {
            list.add("android.permission.RECORD_AUDIO");
        }
        if (context.checkPermission("android.permission.CAMERA", Process.myPid(), Process.myUid()) != PackageManager.PERMISSION_GRANTED) {
            list.add("android.permission.CAMERA");
        }

        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) != PackageManager.PERMISSION_GRANTED) {
            list.add("android.permission.INTERNET");
        }

        if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != PackageManager.PERMISSION_GRANTED) {
            list.add("android.permission.ACCESS_NETWORK_STATE");
        }

        if (context.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) != PackageManager.PERMISSION_GRANTED) {
            list.add("android.permission.ACCESS_WIFI_STATE");
        }

        if (!checkExternalStoragePermission(context)) {
            list.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }

        return list;
    }

    public static boolean checkExternalStoragePermission(Context context) {
        return context.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == PackageManager.PERMISSION_GRANTED;
    }
}