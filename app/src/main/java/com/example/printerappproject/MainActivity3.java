package com.example.printerappproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable;
        colorDrawable = new ColorDrawable(Color.parseColor("#4BB1FF"));

        //Using custom backArrow
        @SuppressLint("UseCompatLoadingForDrawables")
        Drawable backArrow = getResources().getDrawable(R.drawable.ic_baseline_arrow_back_24);
        backArrow.setColorFilter(getResources().getColor(R.color.dark_grey), PorterDuff.Mode.SRC_ATOP);


        if(actionBar!=null) {
            actionBar.setBackgroundDrawable(colorDrawable);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
  //          actionBar.setHomeAsUpIndicator(backArrow);// set drawable icon
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setTitle(null);
        }
    }

    public void cameraMethod(View view)
    {
        startActivity(new Intent(getApplication(), Profile.class));
    }

}