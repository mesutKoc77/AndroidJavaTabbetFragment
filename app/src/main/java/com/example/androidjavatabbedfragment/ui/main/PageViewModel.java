package com.example.androidjavatabbedfragment.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<String> input =new MutableLiveData<>();

    public void setName(String name) {
        input.setValue(name);
    }
    public LiveData<String> getName() {
        return input;
    }

}