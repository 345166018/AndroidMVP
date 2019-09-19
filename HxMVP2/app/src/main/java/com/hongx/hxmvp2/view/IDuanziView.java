package com.hongx.hxmvp2.view;


import com.hongx.hxmvp2.bean.DuanziData;

import java.util.List;

/**
 * @author: fuchenming
 * @create: 2019-09-19 13:55
 */
public interface IDuanziView extends IBaseView {

    void showDuanziView(List<DuanziData> duanziList);
}
