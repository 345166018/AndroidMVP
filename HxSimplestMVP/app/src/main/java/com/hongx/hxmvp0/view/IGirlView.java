package com.hongx.hxmvp0.view;


import com.hongx.hxmvp0.bean.Girl;

import java.util.List;

/**
 * VIEW接口
 * UI逻辑都定义在这里
 */
public interface IGirlView {
    //显示图片(回调函数)
    void showGirlView(List<Girl> girls);
    //加载进度条

    //获取视频资料
}