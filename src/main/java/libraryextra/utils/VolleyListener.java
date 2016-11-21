package libraryextra.utils;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Response;
import com.orhanobut.logger.Logger;

import org.json.JSONException;
import org.json.JSONObject;

import cn.qatime.player.libraryextra.R;


/**
 * @author luntify
 * @date 2016/8/11 15:52
 * @Description
 */
public abstract class VolleyListener implements Response.Listener<JSONObject> {
    private Context context;

    public VolleyListener(Context context) {
        this.context = context;
    }

    @Override
    public void onResponse(JSONObject response) {
        Logger.e("result-----    " + response.toString());
        try {
            if (response.getInt("status") == 0) {
//                onError(response);
                if (response.has("error")) {
                    JSONObject error = response.getJSONObject("error");
                    int code = error.getInt("code");
                    if (code == 1001 || code == 1002 || code == 1003) {
                        onTokenOut();
                    } else if (code == 2002) {
                        onError(response);
                        Toast.makeText(context,context.getResources().getString(R.string.unsupported_client),Toast.LENGTH_SHORT).show();
                    } else {
                        onError(response);
                    }
                } else {
                    onError(response);
                }
//                LogUtils.e(response.getJSONObject("error").get("msg").toString());
            } else {
                onSuccess(response);
            }

        } catch (JSONException e) {
            e.printStackTrace();
            Logger.e("请求********************", "********************异常");
            Toast.makeText(context, "请求出错", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * token过期
     */
    protected abstract void onTokenOut();

    /**
     * 成功返回
     *
     * @param response
     */
    protected abstract void onSuccess(JSONObject response);

    /**
     * 错误返回
     *
     * @param response
     */
    protected abstract void onError(JSONObject response);
}
