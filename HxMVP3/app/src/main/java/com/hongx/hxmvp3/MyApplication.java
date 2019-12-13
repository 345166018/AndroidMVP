package com.hongx.hxmvp3;

import android.app.Application;

import com.hongx.hxmvp3.app.ProjectInit;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ProjectInit.init(this)
                .withApiHost("https://v.juhe.cn/")
                .configure();
    }
}












