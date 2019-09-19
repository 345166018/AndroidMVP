package com.hongx.isolation_processor.httpprocessor;

import java.util.Map;

/**
 * 房产公司
 */
public interface IHttpProcessor {
    /**
     * 网络操作  get post del update put select.......
     */
    void post(String url, Map<String, Object> params, ICallback callback);
}
