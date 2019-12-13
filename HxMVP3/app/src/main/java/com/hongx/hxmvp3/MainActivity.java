package com.hongx.hxmvp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hongx.hxmvp3.net.RestClient;
import com.hongx.hxmvp3.net.callback.IFailure;
import com.hongx.hxmvp3.net.callback.ISuccess;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void get(View view) {

        HashMap params = new HashMap();
        params.put("province_id", "2");
        params.put("key", "自己的key");
        RestClient.create()
                .url("/historyWeather/citys")
                .params(params)
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String responce) {
                        Toast.makeText(MainActivity.this, responce.toString(), Toast.LENGTH_SHORT).show();
                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .build()
                .get();

    }
}
