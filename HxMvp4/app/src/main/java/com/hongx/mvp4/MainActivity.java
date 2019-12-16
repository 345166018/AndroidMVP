package com.hongx.mvp4;

import android.os.Bundle;
import android.widget.ListView;

import com.hongx.mvp4.adapter.GirlAdapter;
import com.hongx.mvp4.bean.Girl;
import com.hongx.mvp4.presenter.GirlPresenter;
import com.hongx.mvp4.rx.databus.RxBus;
import com.hongx.mvp4.view.BaseActivity;
import com.hongx.mvp4.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<GirlPresenter<IGirlView>, IGirlView> implements IGirlView {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
    }
    @Override
    protected void init() {

    }
    @Override
    protected void unRegisterSDK() {
        RxBus.getInstance().unRegister(presenter);
    }

    @Override
    protected void registerSDK() {
        RxBus.getInstance().register(presenter);
    }
    /**
     * 表示层的选择就在这个方法中实现
     */
    @Override
    public GirlPresenter<IGirlView> createPresenter() {
        return new GirlPresenter<>();
    }
    /**
     * UI逻辑
     */
    @Override
    public void showGirlView(List<Girl> girls) {
        //表示层就会把数据填到girls上
        listView.setAdapter(new GirlAdapter(this, girls));

    }
    @Override
    public void showErrorMessage(String msg) {

    }
}
