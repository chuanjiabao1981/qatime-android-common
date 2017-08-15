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

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import libraryextra.rx.callback.CallBack;
import libraryextra.rx.callback.CallBackProxy;
import libraryextra.rx.callback.CallClazzProxy;
import libraryextra.rx.func.ApiResultFunc;
import libraryextra.rx.model.ApiResult;
import libraryextra.rx.subscriber.CallBackSubscriber;
import libraryextra.rx.utils.RxUtil;
import okhttp3.ResponseBody;

/**
 * <p>描述：Put请求</p>
 */
public class PutRequest extends BaseBodyRequest<PutRequest> {
    public PutRequest(String url) {
        super(url);
    }

    public <T> Observable<T> execute(Class<T> clazz) {
        return execute(new CallClazzProxy<ApiResult<T>, T>(clazz) {
        });
    }

    public <T> Observable<T> execute(Type type) {
        return execute(new CallClazzProxy<ApiResult<T>, T>(type) {
        });
    }

    public <T> Observable<T> execute(CallClazzProxy<? extends ApiResult<T>, T> proxy) {
        return build().generateRequest()
                .map(new ApiResultFunc(proxy.getType()))
                .compose(isSyncRequest ? RxUtil._main() : RxUtil._io_main());
    }

    public <T> Disposable execute(CallBack<T> callBack) {
        return execute(new CallBackProxy<ApiResult<T>, T>(callBack) {
        });
    }

    public <T> Disposable execute(CallBackProxy<? extends ApiResult<T>, T> proxy) {
        Observable<ApiResult<T>> observable = build().toObservable(apiManager.get(url, params.urlParamsMap), proxy);

        return observable.subscribeWith(new CallBackSubscriber<ApiResult<T>>(context, proxy.getCallBack()));
    }

    private <T> Observable<ApiResult<T>> toObservable(Observable observable, CallBackProxy<? extends ApiResult<T>, T> proxy) {
        return observable.map(new ApiResultFunc(proxy != null ? proxy.getType() : new TypeToken<ResponseBody>() {
        }.getType()))
                .compose(isSyncRequest ? RxUtil._main() : RxUtil._io_main());
    }

    @Override
    protected Observable<ResponseBody> generateRequest() {
        if (this.object != null) {//自定义的请求object
            return apiManager.putBody(url, object);
        } else {
            return apiManager.put(url, params.urlParamsMap);
        }
    }
}
