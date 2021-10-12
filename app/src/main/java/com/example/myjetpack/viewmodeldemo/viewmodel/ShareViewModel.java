package com.example.myjetpack.viewmodeldemo.viewmodel;

import android.content.ClipData.Item;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareViewModel extends ViewModel {
    private final MutableLiveData<Item> selected = new MutableLiveData<>();

    public void select(Item item){
        selected.setValue(item);
    }

    public LiveData<Item> getSelected(){
        return selected;
    }
}
