package com.hhly.frameworksample.di.component;

import android.app.Application;

import com.hhly.data.DataManager;
import com.hhly.frameworksample.App;
import com.hhly.frameworksample.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @创建者 frank
 * @时间 2017/2/6 14:32
 * @描述：${TODO}
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {


    void injectApp(App app);

    Application getApplication();

    DataManager getDataManager();

}
