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

package libraryextra.rx.subscriber;

import android.content.Context;

import java.lang.ref.WeakReference;

import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import libraryextra.rx.exception.ApiException;

import static libraryextra.rx.utils.Utils.isNetworkAvailable;

/**
 * <p>描述：订阅的基类</p>
 * 1.可以防止内存泄露。<br>
 * 2.在onStart()没有网络时直接onCompleted();<br>
 * 3.统一处理了异常<br>
 */
public abstract class BaseSubscriber<T> extends DisposableObserver<T> {
    public WeakReference<Context> contextWeakReference;

    public BaseSubscriber() {
    }

    @Override
    protected void onStart() {
//        Logger.e("-->http is onStart");
        if (contextWeakReference != null && contextWeakReference.get() != null && !isNetworkAvailable(contextWeakReference.get())) {
            //Toast.makeText(context, "无网络，读取缓存数据", Toast.LENGTH_SHORT).show();
            onComplete();
        }
    }


    public BaseSubscriber(Context context) {
        if (context != null) {
            contextWeakReference = new WeakReference<Context>(context);
        }
    }

    @Override
    public void onNext(@NonNull T t) {
//        Logger.e("-->http is onNext");
    }

    @Override
    public final void onError(java.lang.Throwable e) {
//        Logger.e("-->http is onError");
        if (e instanceof ApiException) {
//            Logger.e("--> e instanceof ApiException err:" + e);
            onError((ApiException) e);
        } else {
//            Logger.e("--> e !instanceof ApiException err:" + e);
            onError(ApiException.handleException(e));
        }
    }

    @Override
    public void onComplete() {
//        Logger.e("-->http is onComplete");
    }


    public abstract void onError(ApiException e);

}