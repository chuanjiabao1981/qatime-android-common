package libraryextra.utils;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.AbsoluteSizeSpan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    /**
     * 返回首字母
     *
     * @param strChinese
     * @return
     */
    /****
     * 是否是有效电话
     ****/
    public static boolean isPhone(String name) {
        Pattern p = Pattern.compile("^((13[0-9])|(17[0-9])|(14[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
        Matcher m = p.matcher(name);
        return m.matches();
    }

    /***
     * 是否是有效Email
     ***/
    public static boolean isEmail(String email) {
        boolean flag = true;
        if (email.indexOf("@") == -1 || email.indexOf(".") == -1) {

            flag = false;
        }
        if (flag) {
            if (email.indexOf("@") > email.indexOf("."))
                flag = false;
        }
        return flag;
    }

    /**
     * 是否是有效密码
     ***/
    public static boolean isGoodPWD(String pwd) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9_]{6,16}$");
        Matcher m = p.matcher(pwd);
        return m.matches();
    }

    public static String getPYIndexStr(String strChinese) {
        if (strChinese.equals("阚")) {
            return "K";
        }
        try {
            StringBuffer buffer = new StringBuffer();

            byte b[] = strChinese.getBytes("GBK");// 把中文转化成byte数组

            for (int i = 0; i < b.length; i++) {

                if ((b[i] & 255) > 128) {

                    int char1 = b[i++] & 255;

                    char1 <<= 8;// 左移运算符用“<<”表示，是将运算符左边的对象，向左移动运算符右边指定的位数，并且在低位补零。其实，向左移n位，就相当于乘上2的n次方

                    int chart = char1 + (b[i] & 255);

                    buffer.append(getPYIndexChar((char) chart));

                    continue;

                }

                char c = (char) b[i];

                if (!Character.isJavaIdentifierPart(c))// 确定指定字符是否可以是 Java
                    // 标识符中首字符以外的部分。

                    c = 'A';

                buffer.append(Character.toUpperCase(c));

            }

            return buffer.toString();

        } catch (Exception e) {
            System.out.println((new StringBuilder())
                    .append("\u53D6\u4E2D\u6587\u62FC\u97F3\u6709\u9519").append(e.getMessage()).toString());

        }

        return null;

    }


    public static String Int2String(int request) {
        return request < 10 ? "0" + request : String.valueOf(request);
    }

    /**
     * @方法描述：（对象为空字符或null或集合长度为0）
     * @返回值：true/false
     */
    public static boolean isNullOrBlanK(Object param) {
        if (param == null) {
            return true;
        } else {
            if (java.lang.String.class.isInstance(param)) {
                if (!"".equals(((String) param).trim())) {
                    return false;
                }
            } else if (java.util.List.class.isInstance(param)) {
                if (((ArrayList) param).size() != 0) {
                    return false;
                }
            } else if (java.util.Map.class.isInstance(param)) {
                if (((HashMap) param).size() != 0) {
                    return false;
                }
            } else if (java.lang.String[].class.isInstance(param)) {
                if (((Object[]) param).length != 0) {
                    return false;
                }
            } else {
                return false;
            }
            return true;
        }
    }

    /**
     * 得到首字母
     *
     * @param strChinese 文字
     * @return
     */

    private static char getPYIndexChar(char strChinese) {

        int charGBK = strChinese;

        char result;

        if (charGBK >= 45217 && charGBK <= 45252)

            result = 'A';

        else if (charGBK >= 45253 && charGBK <= 45760)

            result = 'B';

        else if (charGBK >= 45761 && charGBK <= 46317)

            result = 'C';

        else if (charGBK >= 46318 && charGBK <= 46825)

            result = 'D';

        else if (charGBK >= 46826 && charGBK <= 47009)

            result = 'E';

        else if (charGBK >= 47010 && charGBK <= 47296)

            result = 'F';

        else if (charGBK >= 47297 && charGBK <= 47613)

            result = 'G';

        else if (charGBK >= 47614 && charGBK <= 48118)

            result = 'H';

        else if (charGBK >= 48119 && charGBK <= 49061)

            result = 'J';

        else if (charGBK >= 49062 && charGBK <= 49323)

            result = 'K';

        else if (charGBK >= 49324 && charGBK <= 49895)

            result = 'L';

        else if (charGBK >= 49896 && charGBK <= 50370)

            result = 'M';

        else if (charGBK >= 50371 && charGBK <= 50613)

            result = 'N';

        else if (charGBK >= 50614 && charGBK <= 50621)

            result = 'O';

        else if (charGBK >= 50622 && charGBK <= 50905)

            result = 'P';

        else if (charGBK >= 50906 && charGBK <= 51386)

            result = 'Q';

        else if (charGBK >= 51387 && charGBK <= 51445)

            result = 'R';

        else if (charGBK >= 51446 && charGBK <= 52217)

            result = 'S';

        else if (charGBK >= 52218 && charGBK <= 52697)

            result = 'T';

        else if (charGBK >= 52698 && charGBK <= 52979)

            result = 'W';

        else if (charGBK >= 52980 && charGBK <= 53688)

            result = 'X';

        else if (charGBK >= 53689 && charGBK <= 54480)

            result = 'Y';

        else if (charGBK >= 54481 && charGBK <= 55289)

            result = 'Z';

        else

            result = (char) (65 + (new Random()).nextInt(25));

        result = Character.toUpperCase(result);
        return result;
    }

    /**
     * 获取带属性的字符串
     * @param context
     * @param resource
     * @return
     */
    public static SpannedString getSpannedString(Context context,int resource) {
        // 新建一个可以添加属性的文本对象
        SpannableString ss = new SpannableString(context.getResources().getString(resource));
        // 新建一个属性对象,设置文字的大小
        AbsoluteSizeSpan ass = new AbsoluteSizeSpan(12, true);
        // 附加属性到文本
        ss.setSpan(ass, 0, ss.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        // 设置hint
        return new SpannedString(ss);
    }
    /**
     * 获取带属性的字符串
     * @param context
     * @param resource
     * @return
     */
    public static SpannedString getSpannedString(Context context,String str) {
        // 新建一个可以添加属性的文本对象
        SpannableString ss = new SpannableString(str);
        // 新建一个属性对象,设置文字的大小
        AbsoluteSizeSpan ass = new AbsoluteSizeSpan(12, true);
        // 附加属性到文本
        ss.setSpan(ass, 0, ss.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        // 设置hint
        return new SpannedString(ss);
    }
}
