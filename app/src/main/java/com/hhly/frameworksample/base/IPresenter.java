package com.hhly.frameworksample.base;

/**
 * @创建者 frank
 * @时间 2017/2/6 18:25
 * @描述：${present的接口}
 */

public interface IPresenter<V extends IView,M extends BaseModel> {

    void onAttachView(V view,M model);

    void onDetachView(V view);

}
