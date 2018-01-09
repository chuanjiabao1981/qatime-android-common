/*
 *
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

package libraryextra.rx.callback;

import com.orhanobut.logger.Logger;

import libraryextra.rx.exception.ApiException;

/**
 * <p>描述：简单的回调,默认可以使用该回调，不用关注其他回调方法</p>
 * 使用该回调默认只需要处理onError，onSuccess两个方法既成功失败<br>
 */
public abstract class SimpleCallBack<T> extends CallBack<T> {

    @Override
    public void onStart() {
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(ApiException e) {
        Logger.e(e.getMessage());
    }

}
