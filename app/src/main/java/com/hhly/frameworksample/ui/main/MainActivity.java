package com.hhly.frameworksample.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.hhly.data.bean.NewsBean;
import com.hhly.frameworksample.R;
import com.hhly.frameworksample.base.MvpActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends MvpActivity<MainPresenter,MainModel> implements MainContact.View {

    @BindView(R.id.bt)
    Button mBt;
    @BindView(R.id.tv)
    TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick({R.id.bt})
    void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.bt:
                mPresenter.GetDailyData();
                break;
        }
    }


    @Override
    public void onGetDailyDataSuc(NewsBean newsBean) {

        NewsBean newsBean1 = mModel.disPoseNewsBean(newsBean);
        mTv.setText(newsBean1.toString());

    }

    @Override
    public void onGetDailyDataFailed(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
