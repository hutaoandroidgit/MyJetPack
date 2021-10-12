package com.example.myjetpack.viewmodeldemo;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myjetpack.R;
import com.example.myjetpack.base.BaseActivity;
import com.example.myjetpack.tool.annotation.RegisterView;
import com.example.myjetpack.viewmodeldemo.viewmodel.NameViewModel;

public class NameActivity extends BaseActivity {
    private NameViewModel nameViewModel;
    @RegisterView(id = R.id.tvLiveData)
    private TextView tvLiveData;
    @RegisterView(id = R.id.btnSetData)
    private Button btnSetData;
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_name;
    }

    @Override
    protected void initContentComponentValue() {
        nameViewModel = new ViewModelProvider(this).get(NameViewModel.class);
        nameViewModel.getCurrentName().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                tvLiveData.setText(s);
            }
        });
    }

    @Override
    protected void createListeners() {
        btnSetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameViewModel.setCurrentName("hutao");
            }
        });
    }
}
