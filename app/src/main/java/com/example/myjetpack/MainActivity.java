package com.example.myjetpack;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myjetpack.base.BaseActivity;
import com.example.myjetpack.databinding.DataBindingActivity;
import com.example.myjetpack.lificycle.LifecycleActivity;
import com.example.myjetpack.room.RoomActivtiy;
import com.example.myjetpack.tool.annotation.RegisterView;
import com.example.myjetpack.viewmodeldemo.NameActivity;
import com.example.myjetpack.viewmodeldemo.NumActivity;
import com.example.myjetpack.viewmodeldemo.ShareActivity;

public class MainActivity extends BaseActivity {
    @RegisterView(id = R.id.btnViewMdelDemo)
    private Button btnViewMdelDemo;
    @RegisterView(id = R.id.btnViewMdelDemo2)
    private Button btnViewMdelDemo2;
    @RegisterView(id = R.id.btnLiveDataDemo)
    private Button btnLiveDataDemo;
    @RegisterView(id = R.id.btnDataBinding)
    private Button btnDataBinding;
    @RegisterView(id = R.id.btnLifecycle)
    private Button btnLifecycle;
    @RegisterView(id = R.id.btnRoom)
    private Button btnRoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initContentComponentValue() {

    }

    @Override
    protected void createListeners() {
        btnViewMdelDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Viewmodel demo  数据持久化生命周期
                openActivity(NumActivity.class);
            }
        });
        btnViewMdelDemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Viewmodel demo2  frg通信
                openActivity(ShareActivity.class);
            }
        });
        btnLiveDataDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //LiveData检查数据change
                openActivity(NameActivity.class);
            }
        });

        btnDataBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //databinding大法
                openActivity(DataBindingActivity.class);
            }
        });
        btnLifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Lifecycle大法
                openActivity(LifecycleActivity.class);
            }
        });
        btnRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(RoomActivtiy.class);
            }
        });
    }
}