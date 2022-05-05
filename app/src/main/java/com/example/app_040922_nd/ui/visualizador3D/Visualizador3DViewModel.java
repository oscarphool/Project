package com.example.app_040922_nd.ui.visualizador3D;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Visualizador3DViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Visualizador3DViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is visualizador fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}