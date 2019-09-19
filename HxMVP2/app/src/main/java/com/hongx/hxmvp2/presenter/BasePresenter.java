package com.hongx.hxmvp2.presenter;


import com.hongx.hxmvp2.view.IBaseView;

import java.lang.ref.WeakReference;

public class BasePresenter<T extends IBaseView> {

    //持有左边(VIEW)
    WeakReference<T> iBaseView;

    public void attachView(T view) {
        iBaseView = new WeakReference<>(view);
    }

    public void detachView() {
        if (iBaseView != null) {
            iBaseView.clear();
            iBaseView = null;
        }
    }
}
