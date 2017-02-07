package com.hhly.data.api;

import com.hhly.data.bean.NewsBean;

import retrofit2.http.GET;
import rx.Observable;

/**
 * @创建者 frank
 * @时间 2017/2/6 14:28
 * @描述：${网络接口}
 */

public interface DailyApi {

    //获取最新日报新闻列表
    String URL_GET_LATEST_NEWS = "news/latest";

    /**
     * 获取今日日报新闻列表
     *
     * @return TodayNews
     */
    @GET(URL_GET_LATEST_NEWS)
    Observable<NewsBean> getTodayNews();



}
