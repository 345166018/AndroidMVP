package com.hongx.isolation_processor.httpprocessor;

/**
 * 顶层回调接口(json,xml,....)
 *
 */
public interface ICallback {
    void onSuccess(String result);
    void onFailure(String e);
}
