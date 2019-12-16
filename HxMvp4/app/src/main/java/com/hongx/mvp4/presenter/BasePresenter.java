package com.hongx.mvp4.presenter;


import com.hongx.mvp4.view.IBaseView;

import java.lang.ref.WeakReference;

public class BasePresenter<T extends IBaseView> {

    //持有左边(VIEW)
//    IGirlView iGirlView;
    WeakReference<T> iGirlView;

    public void attachView(T view){
        iGirlView=new WeakReference<>(view);
    }
    public void detachView(){
        if(iGirlView!=null){
            iGirlView.clear();
            iGirlView=null;
        }
    }
}
