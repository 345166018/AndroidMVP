package com.hongx.hxmvp3.net;


import com.hongx.hxmvp3.app.ConfigKeys;
import com.hongx.hxmvp3.app.ProjectInit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public final class RestCreator {
    /**
     * 产生一个全局的retrofit客户端
     */
    private static final class RetrofitHolder {

        private static final String BASE_URL = ProjectInit.getConfiguration(ConfigKeys.API_HOST);

        private static final Retrofit RETROFIT_CLIENT = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .client(OkHttpHolder.OK_HTTP_CLIENT)
                .build();
    }

    /**
     * 可以单独设置的okhttp
     */
    private static final class OkHttpHolder {
        private static final int TIME_OUT = 60;
        private static final OkHttpClient OK_HTTP_CLIENT = new OkHttpClient.Builder()
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .build();
    }

    //提供一个接口让调用者得到retrofit对象
    private static final class RestServiceHolder {
        private static final RestService REST_SERVICE = RetrofitHolder.RETROFIT_CLIENT
                .create(RestService.class);
    }

    /**
     * 获取对象
     */
    public static RestService getRestService() {
        return RestServiceHolder.REST_SERVICE;
    }
}












