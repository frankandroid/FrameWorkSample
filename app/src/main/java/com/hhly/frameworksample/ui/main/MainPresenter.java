package com.hhly.frameworksample.ui.main;

import com.hhly.data.bean.NewsBean;
import com.hhly.frameworksample.base.BasePresenter;

import rx.Observable;
import rx.Subscriber;

/**
 * @创建者 frank
 * @时间 2017/2/6 16:03
 * @描述：${TODO}
 */

public class MainPresenter extends BasePresenter<MainContact.View,MainContact.Model> implements MainContact.Presenter {

    @Override
    public void GetDailyData() {
        Observable<NewsBean> newsData = mDataManager.mDailyRepository.getNewsData();

        addSubscription(newsData, new Subscriber<NewsBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                mView.onGetDailyDataFailed(e.getMessage());
            }

            @Override
            public void onNext(NewsBean newsBean) {
                mView.onGetDailyDataSuc(newsBean);
            }
        });
    }
}
