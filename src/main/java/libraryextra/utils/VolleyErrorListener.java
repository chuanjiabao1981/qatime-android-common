package libraryextra.utils;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import libraryextra.utils.LogUtils;

public class VolleyErrorListener implements Response.ErrorListener {
    @Override
    public void onErrorResponse(VolleyError volleyError) {
        LogUtils.e("联网***************************************************************失败");
    }
}
