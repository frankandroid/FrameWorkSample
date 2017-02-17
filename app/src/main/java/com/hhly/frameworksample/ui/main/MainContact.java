package com.hhly.frameworksample.ui.main;

import com.hhly.data.bean.NewsBean;
import com.hhly.frameworksample.base.BaseModel;
import com.hhly.frameworksample.base.IPresenter;
import com.hhly.frameworksample.base.IView;

/**
 * @创建者 frank
 * @时间 2017/2/6 16:03
 * @描述：${Main页面的接口}
 */

public class MainContact {


    interface Model extends BaseModel{
        //对数据进行处理完后返回给View或者是Presenter
        NewsBean disPoseNewsBean(NewsBean newsBean);
    }


    interface View extends IView {

        void onGetDailyDataSuc(NewsBean newsBean);
        void onGetDailyDataFailed(String msg);

    }

    interface Presenter extends IPresenter<View,Model> {

       void GetDailyData();

    }
}
