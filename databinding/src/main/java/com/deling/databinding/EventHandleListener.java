package com.deling.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class EventHandleListener {

    private Context context;

    public EventHandleListener(Context context) {
        this.context = context;
    }

    public void buttonOnClick(View view){
        Toast.makeText(context,"好喜欢哦",Toast.LENGTH_LONG).show();
    }



}
