package com.example.myjetpack.viewmodeldemo;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myjetpack.R;
import com.example.myjetpack.base.BaseFragment;
import com.example.myjetpack.viewmodeldemo.viewmodel.ShareViewModel;

public class DetailFrg extends BaseFragment {
    @Override
    protected int getLayoutResId() {
        return R.layout.detail_frg;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ShareViewModel model = new ViewModelProvider(requireActivity()).get(ShareViewModel.class);
        model.getSelected().observe(getViewLifecycleOwner(), new Observer<ClipData.Item>() {
            @Override
            public void onChanged(ClipData.Item item) {
                Toast.makeText(requireActivity(), item.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
