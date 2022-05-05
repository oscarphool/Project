package com.example.app_040922_nd.ui.abriraplicaciones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AbrirAplicacionesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AbrirAplicacionesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is abrir aplicaciones fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}