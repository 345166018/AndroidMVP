package com.hongx.hxmvp0.model;

import com.hongx.hxmvp0.R;
import com.hongx.hxmvp0.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: fuchenming
 * @create: 2019-09-16 15:50
 */
public class GirlModel {

    List<Girl> data = new ArrayList<>();


    public void loadGirlData(OnLoadListener onLoadListener) {

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

        onLoadListener.onComplete(data);

    }

    public interface OnLoadListener{
        void onComplete(List<Girl> girls);
    }
}
