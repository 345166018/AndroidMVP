package com.hongx.hxmvp2.model;

import com.hongx.hxmvp2.bean.DuanziData;
import com.hongx.hxmvp2.bean.Girl;

import java.util.List;

/**
 * @author: fuchenming
 * @create: 2019-09-17 11:14
 */
public interface IDuanziModel {
    void loadDuanziData(OnLoadListener onLoadListener);
    interface OnLoadListener{
        void onComplete(List<DuanziData> dataList);
    }
}
