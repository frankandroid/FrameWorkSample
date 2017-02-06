package com.hhly.frameworksample.base;

/**
 * @创建者 frank
 * @时间 2017/2/6 18:25
 * @描述：${present的接口}
 */

public interface IPresenter<V extends IView> {


    void onAttachView(V view);

    void onDetachView(V view);


}
