package libraryextra.utils;

import android.content.Context;
import android.opengl.GLES10;
import android.util.TypedValue;

/**
 * 单位转换类
 */
public class DensityUtils {
    private DensityUtils() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * dp转px
     *
     * @param context
     * @param dpVal
     * @return
     */
    public static int dp2px(Context context, float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpVal, context.getResources().getDisplayMetrics());
    }

    /**
     * sp转px
     *
     * @param context
     * @param spVal
     * @return
     */
    public static int sp2px(Context context, float spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spVal, context.getResources().getDisplayMetrics());
    }

    /**
     * px转dp
     *
     * @param context
     * @param pxVal
     * @return
     */
    public static float px2dp(Context context, float pxVal) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (pxVal / scale);
    }

    /**
     * px转sp
     *
     * @param context
     * @param pxVal
     * @return
     */
    public static float px2sp(Context context, float pxVal) {
        return (pxVal / context.getResources().getDisplayMetrics().scaledDensity);
    }

    private static int textureSize = 0;
    //存在第二次拿拿不到的情况，所以把拿到的数据用一个static变量保存下来
    public static final int getTextureSize() {
        if (textureSize > 0) {
            return textureSize;
        }

        int[] params = new int[1];
        GLES10.glGetIntegerv(GLES10.GL_MAX_TEXTURE_SIZE, params, 0);
        textureSize = params[0];

        return textureSize;
    }
    // 将x向上对齐到2的幂指数
    public static final int roundup2n(int x) {
        if ((x & (x - 1)) == 0) {
            return x;
        }
        int pos = 0;
        while (x > 0) {
            x >>= 1;
            ++pos;
        }
        return 1 << pos;
    }
}