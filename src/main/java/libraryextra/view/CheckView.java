package libraryextra.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import libraryextra.utils.CheckUtil;
import libraryextra.utils.Config;


public class CheckView extends View {
    Context mContext;
    int[] CheckNum = null;
    Paint mTempPaint = new Paint();

    // 验证码
    public CheckView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        mTempPaint.setAntiAlias(true);
        mTempPaint.setTextSize(Config.TEXT_SIZE);
        mTempPaint.setStrokeWidth(3);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawColor(Config.COLOR);
        final int height = getHeight();//获得CheckView控件的高度
        final int width = getWidth();//获得CheckView控件的宽度
        int dx = 40;
        if (CheckNum != null && CheckNum.length > 0) {
            for (int i = 0; i < 4; i++) {//绘制验证控件上的文本
                canvas.drawText("" + CheckNum[i], dx, CheckUtil.getPositon(height), mTempPaint);
                dx += width / 5;
            }
            int[] line;
            for (int i = 0; i < Config.LINE_NUM; i++) {//划线
                line = CheckUtil.getLine(height, width);
                canvas.drawLine(line[0], line[1], line[2], line[3], mTempPaint);
            }
            // 绘制小圆点
            int[] point;
            for (int i = 0; i < Config.POINT_NUM; i++) {//画点
                point = CheckUtil.getPoint(height, width);
                canvas.drawCircle(point[0], point[1], 1, mTempPaint);
            }
        }
    }

    public void setCheckNum(int[] chenckNum) {//设置验证码
        CheckNum = chenckNum;
    }

    public int[] getCheckNum() {//获得验证码
        return CheckNum;
    }

    public void invaliChenkNum() {
        invalidate();
    }
}