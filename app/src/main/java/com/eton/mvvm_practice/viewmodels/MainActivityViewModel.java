package com.eton.mvvm_practice.viewmodels;

import androidx.lifecycle.MutableLiveData;

import com.eton.mvvm_practice.models.NicePlace;

public class MainActivityViewModel {
    private MutableLiveData<NicePlace> nicePlace;

    public void init() {
        
    }

    public MutableLiveData<NicePlace> getNicePlace() {
        return nicePlace;
    }
}