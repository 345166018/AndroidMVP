package com.hongx.mvp4.presenter;


import com.hongx.mvp4.bean.Girl;
import com.hongx.mvp4.model.GirlModel;
import com.hongx.mvp4.model.IGirlModel;
import com.hongx.mvp4.rx.databus.RegisterRxBus;
import com.hongx.mvp4.view.IGirlView;

import java.util.ArrayList;

public class GirlPresenter<T extends IGirlView> extends BasePresenter<T> {

    //持有右边(MODEL)
    IGirlModel iGirlModel = new GirlModel();

    //    public GirlPresenter(T view) {
//        this.iGirlView = iGirlView;
//        iGirlView=new WeakReference<>(view);
//    }
    public GirlPresenter() {
        this.iGirlModel.loadGirlData();
    }

    @RegisterRxBus("")
    public void getShowGirlsData(ArrayList<Girl> girls) {
        iGirlView.get().showGirlView(girls);
    }

    //执行UI逻辑
//    public void fetch(){
//        if(iGirlView.get()!=null && iGirlModel!=null){
//            iGirlModel.loadGirlData(new IGirlModel.OnLoadListener() {
//                @Override
//                public void onComplete(List<Girl> girls) {
//                    //girls上面就是model来的数据
//                    //再交给view
//                    iGirlView.get().showGirlView(girls);
//                }
//            });
//        }
//    }

}







