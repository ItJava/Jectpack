package com.deling.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.lifecycle.LifecycleService;

public class MyLocationService extends LifecycleService {

    public MyLocationService() {
        getLifecycle().addObserver(new MyServiceObserver());

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        super.onBind(intent);
        throw new UnsupportedOperationException("Not yet implemented");
    }



}