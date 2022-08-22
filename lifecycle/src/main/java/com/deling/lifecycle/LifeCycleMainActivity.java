package com.deling.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

public class LifeCycleMainActivity extends AppCompatActivity {

    MyChronometer chronometer  ;
    private long elapsedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_main);
        chronometer=findViewById(R.id.idchronometer);
        getLifecycle().addObserver(chronometer);
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