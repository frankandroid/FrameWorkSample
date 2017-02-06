package com.hhly.frameworksample.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hhly.frameworksample.R;
import com.hhly.frameworksample.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


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
    void onButtonClick(View view){
        switch (view.getId()){
            case R.id.bt:

                break;
        }
    }




}
