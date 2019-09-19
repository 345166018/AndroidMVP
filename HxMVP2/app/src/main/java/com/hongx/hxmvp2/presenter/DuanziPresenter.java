package com.hongx.hxmvp2.presenter;

import com.hongx.hxmvp2.bean.DuanziData;
import com.hongx.hxmvp2.model.DuanziModel;
import com.hongx.hxmvp2.model.IDuanziModel;
import com.hongx.hxmvp2.view.IDuanziView;

import java.util.List;

/**
 * @author: fuchenming
 * @create: 2019-09-19 13:58
 */
public class DuanziPresenter<T extends IDuanziView> extends BasePresenter<T> {

    //持有右边(MODEL)
    IDuanziModel iDuanziModel = new DuanziModel();

    //执行UI逻辑
    public void fetch() {
        if (iBaseView.get() != null && iDuanziModel != null) {

            iDuanziModel.loadDuanziData(new IDuanziModel.OnLoadListener() {
                @Override
                public void onComplete(List<DuanziData> duanziList) {
                    iBaseView.get().showDuanziView(duanziList);
                }
            });

        }
    }


}
