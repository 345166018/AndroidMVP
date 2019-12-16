package com.hongx.mvp4.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hongx.mvp4.presenter.BasePresenter;


public abstract class BaseActivity<T extends BasePresenter, V extends IBaseView> extends AppCompatActivity {
    //持有表示层
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();//各种初始化工作（可以写多个方法）

        //由activity选择一个表示层
        presenter = createPresenter();

        presenter.attachView((V) this);

        registerSDK();

    }

    protected abstract void init();

    protected abstract void unRegisterSDK();

    protected abstract void registerSDK();

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
        unRegisterSDK();
    }
}
