package com.hongx.hxmvp.presenter;

import com.hongx.hxmvp.bean.Girl;
import com.hongx.hxmvp.model.GirlModel;
import com.hongx.hxmvp.model.IGirlModel;
import com.hongx.hxmvp.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * @author: fuchenming
 * @create: 2019-09-16 16:10
 */
public class GirlPresenter<T extends IGirlView> extends BasePresenter<T>{

    //持有左边(VIEW)
//    IGirlView iGirlView;

//    WeakReference<T> iGirlView;

    //持有右边(MODEL)
    IGirlModel iGirlModel = new GirlModel();

//    public GirlPresenter(T view) {
////        this.iGirlView = iGirlView;
//        iGirlView = new WeakReference<>(view);
//    }

//    public void attachView(T view) {
//        iGirlView = new WeakReference<>(view);
//    }

//    public void detachView() {
//        if (iGirlView != null) {
//            iGirlView.clear();
//            iGirlView = null;
//        }
//    }

    //执行UI逻辑
    public void fetch() {
        if (iBaseView.get() != null && iGirlModel != null) {
            iGirlModel.loadGirlData(new IGirlModel.OnLoadListener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    //girls上面就是model来的数据
                    //再交给view
//                    iGirlView.showGirlView(girls);
                    iBaseView.get().showGirlView(girls);
                }
            });
        }
    }

}
