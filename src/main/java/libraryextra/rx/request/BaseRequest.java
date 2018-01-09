/*
 * Copyright (C) 2017 zhouyou(478319399@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package libraryextra.rx.request;

import android.content.Context;
import android.text.TextUtils;

import java.io.File;
import java.io.InputStream;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;

import io.reactivex.Observable;
import libraryextra.rx.HttpManager;
import libraryextra.rx.api.ApiService;
import libraryextra.rx.interceptor.HeadersInterceptor;
import libraryextra.rx.model.HttpHeaders;
import libraryextra.rx.model.HttpParams;
import okhttp3.Cache;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * <p>描述：所有请求的基类</p>
 * 作者： zhouyou<br>
 * 日期： 2017/4/28 17:19 <br>
 * 版本： v1.0<br>
 */
public abstract class BaseRequest<R extends BaseRequest> {
    protected String baseUrl;                                              //BaseUrl
    protected String url;                                                  //请求url
    protected long readTimeOut;                                            //读超时
    protected long writeTimeOut;                                           //写超时
    protected long connectTimeout;                                         //链接超时
    //    protected int retryCount;                                              //重试次数默认3次
//    protected int retryDelay;                                              //延迟xxms重试
//    protected int retryIncreaseDelay;                                      //叠加延迟
    protected boolean isSyncRequest;                                       //是否是同步请求
    protected HttpHeaders headers = new HttpHeaders();                     //添加的header
    protected HttpParams params = new HttpParams();                        //添加的param
    protected Retrofit retrofit;
    protected ApiService apiManager;                                       //通用的的api接口
    protected OkHttpClient okHttpClient;
    protected Context context;
    protected HttpUrl httpUrl;
    protected Proxy proxy;
    protected HostnameVerifier hostnameVerifier;
    protected List<Converter.Factory> converterFactories = new ArrayList<>();
    protected List<CallAdapter.Factory> adapterFactories = new ArrayList<>();
    private boolean enableHeaders = true;                                   //是否添加头,默认加


    public BaseRequest(String url) {
        this.url = url;
        context = HttpManager.getContext();
        HttpManager config = HttpManager.getInstance();
        this.baseUrl = config.getBaseUrl();
        if (!TextUtils.isEmpty(this.baseUrl))
            httpUrl = HttpUrl.parse(baseUrl);
//        retryCount = config.getRetryCount();                              //超时重试次数
//        retryDelay = config.getRetryDelay();                              //超时重试延时
//        retryIncreaseDelay = config.getRetryIncreaseDelay();              //超时重试叠加延时
        //Okhttp  cache
        //默认添加 Accept-Language
//        String acceptLanguage = HttpHeaders.getAcceptLanguage();
//        if (!TextUtils.isEmpty(acceptLanguage))
//            headers(HttpHeaders.HEAD_KEY_ACCEPT_LANGUAGE, acceptLanguage);
        //默认添加 User-Agent
//        String userAgent = HttpHeaders.getUserAgent();
//        if (!TextUtils.isEmpty(userAgent)) headers(HttpHeaders.HEAD_KEY_USER_AGENT, userAgent);
        //添加公共请求参数
        if (config.getCommonParams() != null) params.put(config.getCommonParams());
        if (config.getCommonHeaders() != null) headers.put(config.getCommonHeaders());
    }

    public HttpParams getParams() {
        return this.params;
    }

    public R readTimeOut(long readTimeOut) {
        this.readTimeOut = readTimeOut;
        return (R) this;
    }

    public R writeTimeOut(long writeTimeOut) {
        this.writeTimeOut = writeTimeOut;
        return (R) this;
    }

    public R connectTimeout(long connectTimeout) {
        this.connectTimeout = connectTimeout;
        return (R) this;
    }

    public R unEnableHeaders() {
        this.enableHeaders = false;
        return (R) this;
    }

//    public R okCache(Cache cache) {
//        this.cache = cache;
//        return (R) this;
//    }
//
//    public R cacheMode(CacheMode cacheMode) {
//        this.cacheMode = cacheMode;
//        return (R) this;
//    }
//
//    public R cacheKey(String cacheKey) {
//        this.cacheKey = cacheKey;
//        return (R) this;
//    }
//
//    public R cacheTime(long cacheTime) {
//        if (cacheTime <= -1) cacheTime = HttpManager.DEFAULT_CACHE_NEVER_EXPIRE;
//        this.cacheTime = cacheTime;
//        return (R) this;
//    }

    public R baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        if (!TextUtils.isEmpty(this.baseUrl))
            httpUrl = HttpUrl.parse(baseUrl);
        return (R) this;
    }

//    public R retryCount(int retryCount) {
//        if (retryCount < 0) throw new IllegalArgumentException("retryCount must > 0");
//        this.retryCount = retryCount;
//        return (R) this;
//    }
//
//    public R retryDelay(int retryDelay) {
//        if (retryDelay < 0) throw new IllegalArgumentException("retryDelay must > 0");
//        this.retryDelay = retryDelay;
//        return (R) this;
//    }
//
//    public R retryIncreaseDelay(int retryIncreaseDelay) {
//        if (retryIncreaseDelay < 0)
//            throw new IllegalArgumentException("retryIncreaseDelay must > 0");
//        this.retryIncreaseDelay = retryIncreaseDelay;
//        return (R) this;
//    }

//    public R addInterceptor(Interceptor interceptor) {
//        interceptors.add(Utils.checkNotNull(interceptor, "interceptor == null"));
//        return (R) this;
//    }
//
//    public R addNetworkInterceptor(Interceptor interceptor) {
//        networkInterceptors.add(Utils.checkNotNull(interceptor, "interceptor == null"));
//        return (R) this;
//    }

//    public R addCookie(String name, String value) {
//        Cookie.Builder builder = new Cookie.Builder();
//        Cookie cookie = builder.name(name).value(value).domain(httpUrl.host()).build();
//        this.cookies.add(cookie);
//        return (R) this;
//    }
//
//    public R addCookie(Cookie cookie) {
//        this.cookies.add(cookie);
//        return (R) this;
//    }
//
//    public R addCookies(List<Cookie> cookies) {
//        this.cookies.addAll(cookies);
//        return (R) this;
//    }

    /**
     * 设置Converter.Factory,默认GsonConverterFactory.create()
     */
    public R addConverterFactory(Converter.Factory factory) {
        converterFactories.add(factory);
        return (R) this;
    }

    /**
     * 设置CallAdapter.Factory,默认RxJavaCallAdapterFactory.create()
     */
    public R addCallAdapterFactory(CallAdapter.Factory factory) {
        adapterFactories.add(factory);
        return (R) this;
    }

//    /**
//     * 设置代理
//     */
//    public R okproxy(Proxy proxy) {
//        this.proxy = proxy;
//        return (R) this;
//    }

//    /**
//     * 设置缓存的转换器
//     */
//    public R cacheDiskConverter(IDiskConverter converter) {
//        this.diskConverter = Utils.checkNotNull(converter, "converter == null");
//        return (R) this;
//    }

    /**
     * https的全局访问规则
     */
    public R hostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
        return (R) this;
    }

//    /**
//     * https的全局自签名证书
//     */
//    public R certificates(InputStream... certificates) {
//        this.sslParams = HttpsUtils.getSslSocketFactory(null, null, certificates);
//        return (R) this;
//    }
//
//    /**
//     * https双向认证证书
//     */
//    public R certificates(InputStream bksFile, String password, InputStream... certificates) {
//        this.sslParams = HttpsUtils.getSslSocketFactory(bksFile, password, certificates);
//        return (R) this;
//    }

    /**
     * 添加头信息
     */
    public R headers(HttpHeaders headers) {
        this.headers.put(headers);
        return (R) this;
    }

    /**
     * 添加头信息
     */
    public R headers(String key, String value) {
        headers.put(key, value);
        return (R) this;
    }

    /**
     * 移除头信息
     */
    public R removeHeader(String key) {
        headers.remove(key);
        return (R) this;
    }

    /**
     * 移除所有头信息
     */
    public R removeAllHeaders() {
        headers.clear();
        return (R) this;
    }

    /**
     * 设置参数
     */
    public R params(HttpParams params) {
        this.params.put(params);
        return (R) this;
    }

    public R params(String key, String value) {
        params.put(key, value);
        return (R) this;
    }

    public R removeParam(String key) {
        params.remove(key);
        return (R) this;
    }

    public R removeAllParams() {
        params.clear();
        return (R) this;
    }

    public R syncRequest(boolean syncRequest) {
        this.isSyncRequest = syncRequest;
        return (R) this;
    }


    /**
     * 根据当前的请求参数，生成对应的OkClient
     */
    private OkHttpClient.Builder generateOkClient() {
        final OkHttpClient.Builder newClientBuilder = HttpManager.getOkHttpClient().newBuilder();
        if (readTimeOut > 0)
            newClientBuilder.readTimeout(readTimeOut, TimeUnit.MILLISECONDS);
        if (writeTimeOut > 0)
            newClientBuilder.writeTimeout(writeTimeOut, TimeUnit.MILLISECONDS);
        if (connectTimeout > 0)
            newClientBuilder.connectTimeout(connectTimeout, TimeUnit.MILLISECONDS);
        if (hostnameVerifier != null) newClientBuilder.hostnameVerifier(hostnameVerifier);
        if (proxy != null) newClientBuilder.proxy(proxy);
        //添加头
        if (enableHeaders) {
            newClientBuilder.addInterceptor(new HeadersInterceptor(headers));
        }
        return newClientBuilder;
    }

    /**
     * 根据当前的请求参数，生成对应的Retrofit
     */
    private Retrofit.Builder generateRetrofit() {
        if (converterFactories.isEmpty() && adapterFactories.isEmpty()) {
            return HttpManager.getRetrofitBuilder().baseUrl(baseUrl);
        } else {
            final Retrofit.Builder retrofitBuilder = new Retrofit.Builder();
            if (!converterFactories.isEmpty()) {
                for (Converter.Factory converterFactory : converterFactories) {
                    retrofitBuilder.addConverterFactory(converterFactory);
                }
            } else {
                //获取全局的对象重新设置
                List<Converter.Factory> listConverterFactory = HttpManager.getRetrofit().converterFactories();
                for (Converter.Factory factory : listConverterFactory) {
                    retrofitBuilder.addConverterFactory(factory);
                }
            }
            if (!adapterFactories.isEmpty()) {
                for (CallAdapter.Factory adapterFactory : adapterFactories) {
                    retrofitBuilder.addCallAdapterFactory(adapterFactory);
                }
            } else {
                //获取全局的对象重新设置
                List<CallAdapter.Factory> listAdapterFactory = HttpManager.getRetrofit().callAdapterFactories();
                for (CallAdapter.Factory factory : listAdapterFactory) {
                    retrofitBuilder.addCallAdapterFactory(factory);
                }
            }
            return retrofitBuilder.baseUrl(baseUrl);
        }
    }


    protected R build() {
        OkHttpClient.Builder okHttpClientBuilder = generateOkClient();
        final Retrofit.Builder retrofitBuilder = generateRetrofit();
        retrofitBuilder.addCallAdapterFactory(RxJava2CallAdapterFactory.create());//增加RxJava2CallAdapterFactory
        retrofitBuilder.addConverterFactory(GsonConverterFactory.create());
        okHttpClient = okHttpClientBuilder.build();
        retrofitBuilder.client(okHttpClient);
        retrofit = retrofitBuilder.build();
        apiManager = retrofit.create(ApiService.class);
        return (R) this;
    }

    protected abstract Observable<ResponseBody> generateRequest();
}
