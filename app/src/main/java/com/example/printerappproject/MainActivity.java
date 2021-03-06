package com.example.printerappproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Handler h=new Handler();
        Intent i=new Intent(getApplicationContext(),MainActivity2.class);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);

            }
        }, 5000);
    }


    }

