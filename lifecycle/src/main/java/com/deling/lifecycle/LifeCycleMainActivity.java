package com.deling.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class LifeCycleMainActivity extends AppCompatActivity {

    MyChronometer chronometer  ;
    Button startmyService,  stopmyService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_main);
        chronometer=findViewById(R.id.idchronometer);
        startmyService=findViewById(R.id.startmyService);
        stopmyService=findViewById(R.id.stopmyService);
        getLifecycle().addObserver(chronometer);

        startmyService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(LifeCycleMainActivity.this,MyLocationService.class));
            }
        });
        stopmyService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //stopmyService(new Intent(LifeCycleMainActivity.this,MyLocationService.class));
                 stopService(new Intent(LifeCycleMainActivity.this,MyLocationService.class));
            }
        });

     }

    /*@Override
    protected void onResume() {
        super.onResume();
      *//*  //setBase(long base)：设置计时器的起始时间；
        chronometer.setBase(SystemClock.elapsedRealtime()-elapsedTime);
        chronometer.start();*//*
    }*/


    /*@Override
    protected void onStop() {
        super.onStop();
       *//* //getBase()：返回时间；
        elapsedTime= SystemClock.elapsedRealtime()-chronometer.getBase();   //保存当前停止的时间
        chronometer.stop();*//*
    }*/

}