package com.example.myjetpack.databinding;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.myjetpack.R;
import com.example.myjetpack.base.BaseActivity;

public class DataBindingActivity extends BaseActivity {
    NumViewModel viewModel;
    //bind名称和act名称一样
    ActivityDatabindingBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void setBingingContentView(){
        binding = DataBindingUtil.setContentView(this,getLayoutResId());
    }

    @Override
    protected void initContentComponentValue() {
        //绑定viewmodel
        viewModel = new ViewModelProvider(this).get(NumViewModel.class);
        viewModel.getNumber();
        //给binding设置viewmodel
        binding.setNum(viewModel);
        //自我观察 观察Livedata的数据变化刷新界面
        binding.setLifecycleOwner(this);
    }

    protected boolean isDataBindingAct(){
        return true;
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_databinding;
    }

    @Override
    protected void createListeners() {

    }
}
