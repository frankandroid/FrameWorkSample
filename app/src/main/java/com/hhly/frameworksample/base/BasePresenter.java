package com.hhly.frameworksample.base;

import com.hhly.data.DataManager;
import com.hhly.frameworksample.App;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * @创建者 frank
 * @时间 2017/2/6 16:05
 * @描述：${presenter的基类}
 */

public abstract class BasePresenter<V extends IView> implements IPresenter<V> {

    protected V mView;
    protected DataManager mDataManager;
    private CompositeSubscription mCompositeSubscription;

    public BasePresenter(V view) {
        mDataManager = App.getInstance().getDataManager();
        onAttachView(view);
    }

    @Override
    public void onAttachView(V view) {
      this.mView = view;
    }

    @Override
    public void onDetachView(IView view) {
        onUnSubscribe();
    }
    /**
     * rxJava取消注册，以避免内存泄露
     */
    protected void onUnSubscribe() {
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }

    /**这里是统一处理observable,这样就不用在每次网络请求回来后都加上线程切换的代码*/
    public <T> void addSubscription(Observable<T> observable, Subscriber<T> subscriber) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        Subscription subscription = observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
        mCompositeSubscription.add(subscription);
    }
}
