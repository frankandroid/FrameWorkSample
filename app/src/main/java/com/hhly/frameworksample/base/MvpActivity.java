package com.hhly.frameworksample.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * @创建者 frank
 * @时间 2017/2/7 18:18
 * @描述：${mvpActivity的基类}
 */

public abstract class MvpActivity<P extends IPresenter> extends BaseActivity implements IView {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = initPresenter();
    }

    /**
     * 由子类去创建presenter
     */
    protected abstract P initPresenter();


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.onDetachView(this);
    }

}
