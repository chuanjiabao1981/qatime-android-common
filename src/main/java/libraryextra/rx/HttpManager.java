package libraryextra.rx;

import android.app.Application;
import android.content.Context;

import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import libraryextra.rx.model.HttpHeaders;
import libraryextra.rx.model.HttpParams;
import libraryextra.rx.request.DownloadRequest;
import libraryextra.rx.request.GetRequest;
import libraryextra.rx.request.PostRequest;
import libraryextra.rx.request.PutRequest;
import libraryextra.utils.StringUtils;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * @author luntify
 * @date 2017/8/14 15:00
 * @Description: <p>描述：网络请求入口类</p>
 * 主要功能：</br>
 * 1.全局设置超时时间
 * 2.支持请求错误重试相关参数，包括重试次数、重试延时时间</br>
 * 3.支持缓存支持6种缓存模式、时间、大小、缓存目录</br>
 * 4.支持支持GET、post、delete、put请求</br>
 * 5.支持支持自定义请求</br>
 * 6.支持文件上传、下载</br>
 * 7.支持全局公共请求头</br>
 * 8.支持全局公共参数</br>
 * 9.支持Retrofit相关参数</br>
 */

public class HttpManager {

    private static Application sContext;
    private static final int DEFAULT_MILLISECONDS = 60000;             //默认的超时时间
    private static HttpManager singleton;
    private OkHttpClient.Builder okHttpClientBuilder;                 //okhttp请求的客户端
    private Retrofit.Builder retrofitBuilder;                         //Retrofit请求Builder
    private HttpHeaders mCommonHeaders;                               //全局公共请求头
    private HttpParams mCommonParams;                                 //全局公共请求参数
    private String mBaseUrl;                                          //全局BaseUrl

    private HttpManager() {
        okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.hostnameVerifier(new DefaultHostnameVerifier());
        okHttpClientBuilder.connectTimeout(DEFAULT_MILLISECONDS, TimeUnit.MILLISECONDS);
        okHttpClientBuilder.readTimeout(DEFAULT_MILLISECONDS, TimeUnit.MILLISECONDS);
        okHttpClientBuilder.writeTimeout(DEFAULT_MILLISECONDS, TimeUnit.MILLISECONDS);
        retrofitBuilder = new Retrofit.Builder();
    }

    public static HttpManager getInstance() {
        if (singleton == null) {
            synchronized (HttpManager.class) {
                if (singleton == null) {
                    singleton = new HttpManager();
                }
            }
        }
        return singleton;
    }

    /**
     * 必须在全局Application先调用
     */
    public static void init(Application app) {
        sContext = app;
    }

    /**
     * 获取全局上下文
     */
    public static Context getContext() {
        return sContext;
    }

    /**
     * 全局读取超时时间
     */
    public HttpManager setReadTimeOut(long readTimeOut) {
        okHttpClientBuilder.readTimeout(readTimeOut, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * 全局写入超时时间
     */
    public HttpManager setWriteTimeOut(long writeTimeout) {
        okHttpClientBuilder.writeTimeout(writeTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * 全局连接超时时间
     */
    public HttpManager setConnectTimeout(long connectTimeout) {
        okHttpClientBuilder.connectTimeout(connectTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * 添加全局公共请求参数
     */
    public HttpManager addCommonParams(HttpParams commonParams) {
        if (mCommonParams == null) mCommonParams = new HttpParams();
        mCommonParams.put(commonParams);
        return this;
    }

    /**
     * 获取全局公共请求参数
     */
    public HttpParams getCommonParams() {
        return mCommonParams;
    }

    /**
     * 添加全局公共请求参数
     */
    public HttpManager addCommonHeaders(HttpHeaders commonHeaders) {
        if (mCommonHeaders == null) mCommonHeaders = new HttpHeaders();
        mCommonHeaders.put(commonHeaders);
        return this;
    }

    /**
     * 获取全局公共请求头
     */
    public HttpHeaders getCommonHeaders() {
        return mCommonHeaders;
    }

    /**
     * 全局设置baseurl
     */
    public HttpManager setBaseUrl(String baseUrl) {
        if (!StringUtils.isNullOrBlanK(baseUrl)) {
            mBaseUrl = baseUrl;
        }
        return this;
    }

    /**
     * 获取全局baseurl
     */
    public static String getBaseUrl() {
        return getInstance().mBaseUrl;
    }

    public static Retrofit getRetrofit() {
        return getInstance().retrofitBuilder.build();
    }

    /**
     * 对外暴露 Retrofit,方便自定义
     */
    public static Retrofit.Builder getRetrofitBuilder() {
        return getInstance().retrofitBuilder;
    }

    public static OkHttpClient getOkHttpClient() {
        return getInstance().okHttpClientBuilder.build();
    }

    /**
     * get请求
     */
    public static GetRequest get(String url) {
        return new GetRequest(url);
    }

    /**
     * post请求
     */
    public static PostRequest post(String url) {
        return new PostRequest(url);
    }


//    /**
//     * delete请求
//     */
//    public static DeleteRequest delete(String url) {
//        return new DeleteRequest(url);
//    }

    /**
     * 自定义请求
     */
//    public static CustomRequest custom() {
//        return new CustomRequest();
//    }
    public static DownloadRequest downLoad(String url) {
        return new DownloadRequest(url);
    }

    public static PutRequest put(String url) {
        return new PutRequest(url);
    }


    /**
     * 此类是用于主机名验证的基接口。 在握手期间，如果 URL 的主机名和服务器的标识主机名不匹配，
     * 则验证机制可以回调此接口的实现程序来确定是否应该允许此连接。策略可以是基于证书的或依赖于其他验证方案。
     * 当验证 URL 主机名使用的默认规则失败时使用这些回调。如果主机名是可接受的，则返回 true
     */
    public class DefaultHostnameVerifier implements HostnameVerifier {
        @Override
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    }
}
