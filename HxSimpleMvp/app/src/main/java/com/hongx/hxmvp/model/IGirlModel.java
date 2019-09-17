package com.hongx.hxmvp.model;

/**
 * @author: fuchenming
 * @create: 2019-09-16 15:41
 */

import com.hongx.hxmvp.bean.Girl;

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
