package com.example.myjetpack.viewmodeldemo;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.example.myjetpack.R;
import com.example.myjetpack.base.BaseFragment;
import com.example.myjetpack.tool.annotation.RegisterView;
import com.example.myjetpack.viewmodeldemo.viewmodel.ShareViewModel;

public class MasterFrg extends BaseFragment {
    private ShareViewModel model;
    @RegisterView(id = R.id.button2)
    private Button button2;

    @Override
    protected int getLayoutResId() {
        return R.layout.mater_frg;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        model = new ViewModelProvider(requireActivity()).get(ShareViewModel.class);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.select(new ClipData.Item("111"));
            }
        });
    }
}
