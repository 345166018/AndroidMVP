package com.hongx.hxmvp.presenter;

import com.hongx.hxmvp.view.IGirlView;

import java.lang.ref.WeakReference;

public class BasePresenter<T extends IGirlView> {

    //持有左边(VIEW)
//    IGirlView iGirlView;
    WeakReference<T> iGirlView;

    public void attachView(T view) {
        iGirlView = new WeakReference<>(view);
    }

    public void detachView() {
        if (iGirlView != null) {
            iGirlView.clear();
            iGirlView = null;
        }
    }
}
