package com.eton.mvvm_practice.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.eton.mvvm_practice.models.NicePlace;
import com.eton.mvvm_practice.repositories.NicePlaceRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<List<NicePlace>> nicePlace;

    public void init() {
        if (nicePlace != null) {
            return;
        }

        NicePlaceRepository repository = NicePlaceRepository.getInstance();
        nicePlace = repository.getNicePlace();
    }

    public MutableLiveData<List<NicePlace>> getNicePlace() {
        return nicePlace;
    }
}