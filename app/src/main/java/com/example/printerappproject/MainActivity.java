package com.example.printerappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
//        Handler handler = new Handler();
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);

        /*Thread background = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    startActivity(i);
                    finish();
                } catch (Exception e) {
                }
            }
        };
        background.start();
        */

        new Handler(Looper.myLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);
            }
        }, 3000);

    }
    }


