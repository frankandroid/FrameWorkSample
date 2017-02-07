package com.hhly.data;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hhly.data.api.DailyApi;
import com.hhly.data.repository.DailyRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @创建者 frank
 * @时间 2017/2/6 15:39
 * @描述：${提供和网络相关的类对象}
 */
@Module
public class DataModule {

    private static final String BASE_URL = "http://news-at.zhihu.com/api/4/";

    @Singleton
    @Provides
    public DailyRepository provideDailyRepository(DailyApi dailyApi) {
        return new DailyRepository(dailyApi);
    }


    @Singleton
    @Provides
    public DailyApi provideDailyApi(Retrofit retrofit) {
        return retrofit.create(DailyApi.class);
    }


    /**
     * Retrofit
     *
     * @param client           OkHttpClient
     * @param converterFactory Converter.Factory
     * @return Retrofit
     */
    @Provides
    @Singleton
    public Retrofit provideClientApi(OkHttpClient client, Converter.Factory converterFactory) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(converterFactory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        return retrofit;
    }


    /**
     * Gson转换器单例对象
     *
     * @param gson Gson
     * @return Converter.Factory
     */
    @Provides
    @Singleton
    public Converter.Factory provideConverter(Gson gson) {
        return GsonConverterFactory.create(gson);
    }


    /**
     * Gson 单例对象
     *
     * @return Gson
     */
    @Provides
    @Singleton
    public Gson provideGson() {
        return new GsonBuilder().serializeNulls().create();
    }

    /**
     * OkHttp客户端单例对象
     *
     * @param loggingInterceptor HttpLoggingInterceptor
     * @return OkHttpClient
     */
    @Provides
    @Singleton
    public OkHttpClient provideClient(HttpLoggingInterceptor loggingInterceptor) {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .addNetworkInterceptor(new StethoInterceptor())
                .build();
        return client;
    }

    /**
     * 日志拦截器单例对象,用于OkHttp层对日志进行处理
     *
     * @return HttpLoggingInterceptor
     */
    @Provides
    @Singleton
    public HttpLoggingInterceptor provideLogger() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        return interceptor;
    }

}
