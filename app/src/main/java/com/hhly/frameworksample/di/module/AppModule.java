package com.hhly.frameworksample.di.module;

import android.app.Application;

import com.hhly.data.DataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @创建者 frank
 * @时间 2017/2/6 14:32
 * @描述：${TODO}
 */
@Module()
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Singleton
    @Provides
    Application provideApplication(){
        return  mApplication;
    }

    @Singleton
    @Provides
    DataManager provideDataManager(){

        return new DataManager();
    }


}
