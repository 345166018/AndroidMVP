package com.hongx.hxmvp2.model;


import com.hongx.hxmvp2.bean.Girl;

import java.util.List;

/**
 * model还是原来的model
 */
public interface IGirlModel {
    void loadGirlData(OnLoadListener onLoadListener);
    interface OnLoadListener{
        void onComplete(List<Girl> girls);
    }
}












