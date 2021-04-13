package com.example.monage.ui.pemasukkan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PemasukkanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PemasukkanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}