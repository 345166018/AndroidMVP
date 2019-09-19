package com.hongx.hxmvp2.model;

import android.util.Log;


import com.hongx.hxmvp2.R;
import com.hongx.hxmvp2.bean.Girl;
import com.hongx.hxmvp2.bean.ResponceData;
import com.hongx.isolation_processor.httpprocessor.HttpCallback;
import com.hongx.isolation_processor.httpprocessor.HttpHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GirlModel implements IGirlModel {
    List<Girl> data=new ArrayList<>();
    @Override
    public void loadGirlData(OnLoadListener onLoadListener) {
//            data.add(new Girl(R.drawable.f1, "一星", "****"));
//            data.add(new Girl(R.drawable.f2, "一星", "****"));
//            data.add(new Girl(R.drawable.f3, "一星", "****"));
//            data.add(new Girl(R.drawable.f4, "一星", "****"));
//            data.add(new Girl(R.drawable.f5, "一星", "****"));
//            data.add(new Girl(R.drawable.f6, "一星", "****"));
//            data.add(new Girl(R.drawable.f7, "一星", "****"));
//            data.add(new Girl(R.drawable.f8, "一星", "****"));
//            data.add(new Girl(R.drawable.f9, "一星", "****"));
//            data.add(new Girl(R.drawable.f10, "一星", "****"));
//        onLoadListener.onComplete(data);

        //测试隔离层代码
//        String url="https://v.juhe.cn/historyWeather/citys";
        String url="https://www.apiopen.top/satinApi";
        HashMap<String,Object> params=new HashMap<>();
        params.put("type","1");
        params.put("page","1");
        HttpHelper.obtain().post(url, params, new HttpCallback<ResponceData>() {
            @Override
            public void onSuccess(ResponceData responceData) {
                Log.i("hongxue resultcode = ",responceData.getResultcode());
//                Log.i("hongxue result = ",responceData.getResult());



            }
        });
    }
}
