package com.deling.databinding4;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class UserViewModel extends BaseObservable {

    private User user;

    public UserViewModel() {
        this.user = new User("方晨");
    }

    @Bindable
    public String getUserName(){
        return user.userName;
    }

    public void setUserName(String userName){
        if(userName!=null&&!userName.equals(user.userName)){
            user.userName=userName;
            Log.d("ning","set username:"+userName);
             notifyPropertyChanged(BR.userName);

        }
    }

}
