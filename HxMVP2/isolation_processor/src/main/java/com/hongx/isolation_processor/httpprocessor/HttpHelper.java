package com.hongx.isolation_processor.httpprocessor;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * 代理类(业务员)
 */
public class HttpHelper implements IHttpProcessor {

    //单例
    private static HttpHelper instance;

    public static HttpHelper obtain() {
        synchronized (HttpHelper.class) {
            if (instance == null) {
                instance = new HttpHelper();
            }
        }
        return instance;
    }

    private HttpHelper() {
    }

    private static IHttpProcessor mIHttpProcessor;

    //定义一个API,用来设置代码的接口(业务员找到一个对应的有房的人)
    public static void init(IHttpProcessor iHttpProcessor) {
        mIHttpProcessor = iHttpProcessor;
    }

    @Override
    public void post(String url, Map<String, Object> params, ICallback callback) {
        //http://www.aaa.bbb/index
        //user=jett&pwd=123
        //http://www.aaa.bbb/index?&user=jett&pwd=123
//        String finalUrl = appendParams(url, params);
//        mIHttpProcessor.post(finalUrl, params, callback);
        mIHttpProcessor.post(url, params, callback);
    }

    public static String appendParams(String url, Map<String, Object> params) {
        if (params == null || params.isEmpty()) {
            return url;
        }
        StringBuilder urlBuilder = new StringBuilder(url);
        if (urlBuilder.indexOf("?") <= 0) {
            urlBuilder.append("?");
        } else {
            if (!urlBuilder.toString().endsWith("?")) {
                urlBuilder.append("&");
            }
        }
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            urlBuilder.append("&" + entry.getKey())
                    .append("=")
                    .append(encode(entry.getValue().toString()));
        }
        return urlBuilder.toString();
    }

    private static String encode(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

}










