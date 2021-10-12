package com.example.myjetpack.viewmodeldemo;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.example.myjetpack.R;
import com.example.myjetpack.base.BaseActivity;
import com.example.myjetpack.tool.annotation.RegisterView;
import com.example.myjetpack.viewmodeldemo.viewmodel.NumViewModel;


public class NumActivity extends BaseActivity {
    @RegisterView(id = R.id.textView)
    private TextView textView;
    @RegisterView(id = R.id.button)
    private Button button;
    NumViewModel numViewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_viewmodeldemo;
    }

    @Override
    protected void initContentComponentValue() {
        //绑定viewmodel
        numViewModel = new ViewModelProvider
                (this,new ViewModelProvider.NewInstanceFactory()).get(NumViewModel.class);
        textView.setText(String.valueOf(numViewModel.number));

    }

    @Override
    protected void createListeners() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numViewModel.number++;
                textView.setText(String.valueOf(numViewModel.number));
            }
        });
    }
}
