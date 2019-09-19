package com.hongx.hxmvp2;

import android.os.Bundle;
import android.widget.ListView;

import com.hongx.hxmvp2.adapter.DuanziAdapter;
import com.hongx.hxmvp2.bean.DuanziData;
import com.hongx.hxmvp2.presenter.DuanziPresenter;
import com.hongx.hxmvp2.view.BaseActivity;
import com.hongx.hxmvp2.view.IDuanziView;

import java.util.List;

public class MainActivity extends BaseActivity<DuanziPresenter<IDuanziView>, IDuanziView> implements IDuanziView {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        presenter.fetch();

    }


    /**
     * 表示层的选择就在这个方法中实现
     */
    @Override
    protected DuanziPresenter<IDuanziView> createPresenter() {
        return new DuanziPresenter<>();
    }

    /**
     * UI逻辑
     */
    @Override
    public void showDuanziView(List<DuanziData> duanziList) {
        listView.setAdapter(new DuanziAdapter(this, duanziList));
    }

    @Override
    public void showErrorMessage(String msg) {

    }
}
