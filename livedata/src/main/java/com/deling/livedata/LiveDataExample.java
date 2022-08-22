package com.deling.livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class LiveDataExample extends AppCompatActivity {



     TextView tvnumber;
     MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data_example);
        tvnumber=findViewById(R.id.tvnumber);
        viewModel= new ViewModelProvider(this).get(MyViewModel.class);
        tvnumber.setText(String.valueOf(viewModel.getCurrentSecond().getValue()));

        viewModel.getCurrentSecond().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                tvnumber.setText(String.valueOf(integer));
            }
        });
        startTimer();
    }

    private void startTimer() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                //非UI线程用postValue
                //UI线程用setValue
                viewModel.getCurrentSecond().postValue(viewModel.getCurrentSecond().getValue()+1);
            }
        },1000,1000);

    }


}