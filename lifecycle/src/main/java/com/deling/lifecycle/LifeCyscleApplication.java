package com.deling.lifecycle;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

public class LifeCyscleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ApplicationLifecycle());

    }
}
