package com.hongx.hxmvp0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.hongx.hxmvp0.adapter.GirlAdapter;
import com.hongx.hxmvp0.bean.Girl;
import com.hongx.hxmvp0.presenter.GirlPresenter;
import com.hongx.hxmvp0.view.IGirlView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IGirlView {
    ListView listView;
    GirlPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        presenter = new GirlPresenter();

        presenter.attachView(this);

        presenter.fetch();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public void showGirlView(List<Girl> girls) {
        listView.setAdapter(new GirlAdapter(this, girls));
    }
}
