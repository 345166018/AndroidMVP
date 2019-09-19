package com.hongx.hxmvp2.model;

import android.util.Log;

import com.hongx.hxmvp2.bean.DuanziData;
import com.hongx.hxmvp2.bean.DuanziRootBean;
import com.hongx.hxmvp2.bean.ResponceData;
import com.hongx.isolation_processor.httpprocessor.HttpCallback;
import com.hongx.isolation_processor.httpprocessor.HttpHelper;

import java.util.HashMap;

/**
 * @author: fuchenming
 * @create: 2019-09-17 11:14
 */
public class DuanziModel implements IDuanziModel {
    @Override
    public void loadDuanziData(final OnLoadListener onLoadListener) {

        String url="https://www.apiopen.top/satinApi";
        HashMap<String,Object> params=new HashMap<>();
        params.put("type","1");
        params.put("page","1");
        HttpHelper.obtain().post(url, params, new HttpCallback<DuanziRootBean>() {
            @Override
            public void onSuccess(DuanziRootBean bean) {
                Log.i("hongxue resultcode = ",bean.getCode() + "");
//                Log.i("hongxue result = ",responceData.getResult());

                onLoadListener.onComplete(bean.getData());

            }
        });


    }
}
