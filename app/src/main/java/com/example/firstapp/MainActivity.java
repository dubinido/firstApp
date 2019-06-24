package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;


/*
import com.google.android.material.snackbar.Snackbar;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        come = false;
        //FacebookSdk.sdkInitialize(getApplicationContext());
        //AppEventsLogger.activateApp(this); //AppEventsLogger.activateApp(getApplication());
    }

    private boolean come;
    public void message(View v)
    {
        String stringId = "You Got It!";
        int duration =  Snackbar.LENGTH_LONG;// try to use this argument for the duration next line
        Snackbar mess = Snackbar.make(v, stringId, duration);
        mess.show();
    }

    public boolean boolCome() //returning do you come to the volleyball
    {
        return come;
    }

    public void comingToVolley(View v) // this function activated when pressing the button and telling if the user is coming to thr game.
    {
        String userMessage;
        int duration = Snackbar.LENGTH_INDEFINITE;
        if(!come) {
            userMessage = "נרשמת בהצלחה";
            come = true;
        }
        else {
            userMessage = "בטלת את הרשמתך";
            come = false;
        }
        Snackbar mess = Snackbar.make(v, userMessage, duration);
        mess.show();
    }

    public void moveToReg(View v)
    {
        Intent myIntent = new Intent(getBaseContext(), Register.class);
        startActivity(myIntent);
    }


}
