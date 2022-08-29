package com.deling.databinding5;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

public class UserViewModel  {

    private ObservableField<User> userObservableField;

    public UserViewModel(){
        User user=new User("方晨");
        userObservableField=new ObservableField<>();
        userObservableField.set(user);
    }

    public String getUserName(){
          return userObservableField.get().userName;
    }

    public void setUserName(String userName){
        Log.d("wfc"," userObservableField.get().userName:"+userName);
        userObservableField.get().userName=userName;

    }


  /*  private User user;

    public UserViewModel() {
        this.user = new User("方晨");
    }*/

   /* @Bindable
    public String getUserName(){
        return user.userName;
    }

    public void setUserName(String userName){
        if(userName!=null&&!userName.equals(user.userName)){
            user.userName=userName;
            Log.d("ning","set username:"+userName);
             notifyPropertyChanged(BR.userName);

        }
    }*/

}
