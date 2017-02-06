package com.hhly.data.repository;

import com.hhly.data.api.DailyApi;
import com.hhly.data.bean.NewsBean;

import rx.Observable;

/**
 * @创建者 frank
 * @时间 2017/2/6 18:00
 * @描述：${TODO}
 */

public class DailyRepository {

    DailyApi mDailyApi;


    public DailyRepository(DailyApi dailyApi) {
        mDailyApi = dailyApi;
    }

    public Observable<NewsBean> getNewsData() {
        return mDailyApi.getTodayNews();
    }

}
