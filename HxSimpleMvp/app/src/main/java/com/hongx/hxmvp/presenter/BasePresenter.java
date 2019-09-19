package com.hongx.hxmvp.presenter;

import com.hongx.hxmvp.view.IBaseView;
import com.hongx.hxmvp.view.IGirlView;

import java.lang.ref.WeakReference;

public class BasePresenter<T extends IBaseView> {

    //持有左边(VIEW)
//    IGirlView iGirlView;
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
