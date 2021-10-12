package com.example.myjetpack.viewmodeldemo.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NameViewModel extends ViewModel {
    private MutableLiveData<String> currentName;
    public MutableLiveData<String> getCurrentName(){
        if (currentName == null){
            currentName = new MutableLiveData<String>();
        }
        return currentName;
    }
    public void setCurrentName(String s){
        currentName.setValue(s);
    }
}
