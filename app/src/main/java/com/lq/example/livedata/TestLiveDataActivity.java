package com.lq.example.livedata;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lq.example.R;
/**
 *description:
 * 
 *@author:mick
 *@date:2018/11/16
 */
public class TestLiveDataActivity extends AppCompatActivity {
    TextView tv_show;
    private UserInfModel mUserInfModel;
    private UserInfoModelString mUserInfoModelString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_live_data);
        initView();

//        mUserInfModel = ViewModelProviders.of(this).get(UserInfModel.class);
//        mUserInfModel.getUserName().observe(this,new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                tv_show.setText(s);
//            }
//        });

        mUserInfoModelString = new UserInfoModelString();
        mUserInfoModelString.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                tv_show.setText(s);
            }
        });

    }

    private void initView() {
        tv_show = findViewById(R.id.tv_show);
        findViewById(R.id.btn_change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mUserInfModel.getUserName().setValue("我是改变之后的民办自");
                mUserInfoModelString.setName("我是改变之后的值");

            }
        });
    }
}
