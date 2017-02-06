package com.hhly.data;

import com.hhly.data.repository.DailyRepository;

import javax.inject.Inject;

/**
 * @创建者 frank
 * @时间 2017/2/6 15:31
 * @描述：${}
 */

public class DataManager {


    @Inject
    public DailyRepository mDailyRepository;


    public DataManager() {

        DaggerDataComponent.builder().dataModule(new DataModule()).build().injectDataManager(this);

    }


}
