package com.example.myjetpack.databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NumViewModel extends ViewModel{
    public MutableLiveData<Integer> number;

    public MutableLiveData<Integer> getNumber(){
        if (number == null){
            number = new MutableLiveData<>();
            number.setValue(0);
        }
        return number;
    }

    public void addNumber(int num){
        number.setValue(number.getValue() + num);
    }
}
