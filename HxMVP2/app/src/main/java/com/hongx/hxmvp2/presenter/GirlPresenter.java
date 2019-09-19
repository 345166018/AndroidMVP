package com.hongx.hxmvp2.presenter;


import com.hongx.hxmvp2.bean.Girl;
import com.hongx.hxmvp2.model.GirlModel;
import com.hongx.hxmvp2.model.IGirlModel;
import com.hongx.hxmvp2.view.IGirlView;

import java.util.List;

public class GirlPresenter<T extends IGirlView> extends BasePresenter<T>{

    //持有右边(MODEL)
    IGirlModel iGirlModel=new GirlModel();

//    public GirlPresenter(T view) {
//        this.iGirlView = iGirlView;
//        iGirlView=new WeakReference<>(view);
//    }

    //执行UI逻辑
    public void fetch(){
        if(iBaseView.get()!=null && iGirlModel!=null){
            iGirlModel.loadGirlData(new IGirlModel.OnLoadListener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    //girls上面就是model来的数据
                    //再交给view
                    iBaseView.get().showGirlView(girls);
                }
            });
        }
    }

}







