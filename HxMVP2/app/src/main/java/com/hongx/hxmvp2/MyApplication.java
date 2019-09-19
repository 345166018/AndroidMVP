package com.hongx.hxmvp2;

import android.app.Application;

import com.hongx.isolation_processor.httpprocessor.HttpHelper;
import com.hongx.isolation_processor.httpprocessor.OkHttpProcessor;
import com.hongx.isolation_processor.httpprocessor.VolleyProcessor;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //进行框架的选择
        HttpHelper.init(new VolleyProcessor(this));
//        HttpHelper.init(new OkHttpProcessor());
//        HttpHelper.init(new XUtilsProcessor(this));
//        HttpHelper.init(new RetrofitProcessor());
    }
}
