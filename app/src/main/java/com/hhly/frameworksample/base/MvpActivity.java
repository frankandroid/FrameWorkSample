package com.hhly.frameworksample.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hhly.frameworksample.util.TUtil;

/**
 * @创建者 frank
 * @时间 2017/2/7 18:18
 * @描述：${mvpActivity的基类}
 */

public abstract class MvpActivity<P extends IPresenter, M extends BaseModel> extends BaseActivity
        implements IView {

    protected P mPresenter;
    protected M mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = TUtil.getT(this, 0);
        mModel = TUtil.getT(this, 1);

        mPresenter.onAttachView(this,mModel);

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.onDetachView(this);
    }

}
