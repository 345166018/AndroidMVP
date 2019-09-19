package com.hongx.hxmvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.hongx.hxmvp.presenter.BasePresenter;


public abstract class BaseActivity<T extends BasePresenter,V extends IBaseView> extends AppCompatActivity {
    //持有表示层
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //由activity选择一个表示层
        presenter=createPresenter();

        presenter.attachView((V)this);

    }

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
