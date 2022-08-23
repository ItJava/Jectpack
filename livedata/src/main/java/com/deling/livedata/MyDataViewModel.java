package com.deling.livedata;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author: njb
 * @date: 2020/9/2 0002 0:43
 * @desc:
 */
public class MyDataViewModel extends ViewModel {
    private MutableLiveData<Integer> progress;


    public LiveData<Integer> getProgress() {
        if (progress == null) {
            progress = new MutableLiveData<>();
        }
        return progress;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        progress = null;
    }
}