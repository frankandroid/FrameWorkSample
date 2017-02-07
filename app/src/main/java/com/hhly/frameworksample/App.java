package com.hhly.frameworksample;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.hhly.data.DataManager;
import com.hhly.frameworksample.di.component.AppComponent;
import com.hhly.frameworksample.di.component.DaggerAppComponent;
import com.hhly.frameworksample.di.module.AppModule;

import javax.inject.Inject;

/**
 * @创建者 frank
 * @时间 2017/2/6 14:32
 * @描述：${TODO}
 */

public class App extends Application {

    @Inject
    DataManager mDataManager;

    AppComponent mAppComponent;

    private static App mApp;

    @Override
    public void onCreate() {
        super.onCreate();

        mApp = this;

        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        mAppComponent.injectApp(this);

        if (BuildConfig.DEBUG) {
            Stetho.initialize(Stetho.newInitializerBuilder(this)
                    .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                    .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                    .build());
        }
    }


    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }

    public static App getInstance(){
        return mApp;
    }

}
