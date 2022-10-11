package com.example.mcoe_it;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDelegate;

import java.util.Timer;
import java.util.TimerTask;


//This File contains the Code For Loading Screen File


public class LoadingScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);
        activitySwitch();
        RunAnimation();


    }

    public void activitySwitch() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(LoadingScreen.this, Home.class);
                startActivity(intent);
                finish();
            }
        }, 900);
    }


    private void RunAnimation()
    {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.fade);
        a.reset();
        ImageView tv = (ImageView) findViewById(R.id.logoImage);
        TextView txv = (TextView) findViewById(R.id.deptITTransition);
        TextView cpy = (TextView) findViewById(R.id.copyright);
        tv.clearAnimation();
        tv.startAnimation(a);
        tv.setVisibility(View.INVISIBLE);

        txv.clearAnimation();
        txv.startAnimation(a);
        txv.setVisibility(View.INVISIBLE);


    }

}