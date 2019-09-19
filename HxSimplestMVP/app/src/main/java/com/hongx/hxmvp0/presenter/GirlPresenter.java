package com.hongx.hxmvp0.presenter;



import com.hongx.hxmvp0.bean.Girl;
import com.hongx.hxmvp0.model.GirlModel;
import com.hongx.hxmvp0.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * @author: fuchenming
 * @create: 2019-09-16 16:10
 */
public class GirlPresenter{

    //持有右边(MODEL)
    GirlModel iGirlModel = new GirlModel();

    WeakReference<IGirlView> iGirlView;

    public void attachView(IGirlView view) {
        iGirlView = new WeakReference<>(view);
    }

    public void detachView() {
        if (iGirlView != null) {
            iGirlView.clear();
            iGirlView = null;
        }
    }

    //执行UI逻辑
    public void fetch() {

        if (iGirlView.get() != null && iGirlModel != null) {
            iGirlModel.loadGirlData(new GirlModel.OnLoadListener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    iGirlView.get().showGirlView(girls);
                }
            });
        }

    }

}
