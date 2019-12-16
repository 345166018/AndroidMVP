package com.hongx.mvp4.model;


import com.hongx.mvp4.R;
import com.hongx.mvp4.bean.Girl;
import com.hongx.mvp4.rx.databus.RxBus;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Function;

public class GirlModel implements IGirlModel {

    @Override
    public void loadGirlData() {
        RxBus.getInstance().chainProcess(new Function() {
            @Override
            public Object apply(Object o) throws Exception {
                List<Girl> data = new ArrayList<>();
                data.add(new Girl(R.drawable.f1, "一星", "****"));
                data.add(new Girl(R.drawable.f2, "一星", "****"));
                data.add(new Girl(R.drawable.f3, "一星", "****"));
                data.add(new Girl(R.drawable.f4, "一星", "****"));
                data.add(new Girl(R.drawable.f5, "一星", "****"));
                data.add(new Girl(R.drawable.f6, "一星", "****"));
                data.add(new Girl(R.drawable.f7, "一星", "****"));
                data.add(new Girl(R.drawable.f8, "一星", "****"));
                data.add(new Girl(R.drawable.f9, "一星", "****"));
                data.add(new Girl(R.drawable.f10, "一星", "****"));
                return data;
            }
        });
    }
}
