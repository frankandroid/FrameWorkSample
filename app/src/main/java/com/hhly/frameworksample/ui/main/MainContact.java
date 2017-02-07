package com.hhly.frameworksample.ui.main;

import com.hhly.data.bean.NewsBean;
import com.hhly.frameworksample.base.IPresenter;
import com.hhly.frameworksample.base.IView;

/**
 * @创建者 frank
 * @时间 2017/2/6 16:03
 * @描述：${Main页面的接口}
 */

public class MainContact {

    interface View extends IView {

        void onGetDailyDataSuc(NewsBean newsBean);
        void onGetDailyDataFailed(String msg);

    }

    interface Presenter extends IPresenter<View> {

       void GetDailyData();

    }
}
