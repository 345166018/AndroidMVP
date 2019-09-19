package com.hongx.hxmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.hongx.hxmvp.adapter.GirlAdapter;
import com.hongx.hxmvp.bean.Girl;
import com.hongx.hxmvp.presenter.BasePresenter;
import com.hongx.hxmvp.presenter.GirlPresenter;
import com.hongx.hxmvp.view.BaseActivity;
import com.hongx.hxmvp.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<GirlPresenter<IGirlView>, IGirlView> implements IGirlView {

    ListView listView;
//    GirlPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

//        presenter = new GirlPresenter(this);
//        presenter = new GirlPresenter();
//        presenter.attachView(this);
        presenter.fetch();

    }

    @Override
    protected GirlPresenter<IGirlView> createPresenter() {
        return new GirlPresenter<>();
    }


//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        presenter.detachView();
//    }

    @Override
    public void showGirlView(List<Girl> girls) {
        listView.setAdapter(new GirlAdapter(this, girls));
    }

    @Override
    public void showErrorMessage(String msg) {

    }
}
