package com.hhly.data;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @创建者 frank
 * @时间 2017/2/6 17:21
 * @描述：${TODO}
 */
@Singleton
@Component(modules = DataModule.class)
public interface DataComponent {


    void injectDataManager(DataManager dataManager);


}
