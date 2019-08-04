package com.eton.mvvm_practice.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.eton.mvvm_practice.models.NicePlace;

import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<List<NicePlace>> nicePlace;

    public void init() {

    }

    public MutableLiveData<List<NicePlace>> getNicePlace() {
        return nicePlace;
    }
}