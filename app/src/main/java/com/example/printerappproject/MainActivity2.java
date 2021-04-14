package com.example.printerappproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar;

      /* /////DO NOT DELETE THESE COMMENTED LINES TILL THE END OF THIS PROJECT///////

        Toolbar toolbar;
        toolbar= findViewById(R.id.toolbar);
        toolbar=setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
        }
        */

        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#4BB1FF"));
        actionBar.setBackgroundDrawable(colorDrawable);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);// set drawable icon
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main,menu);
        //menu.
        menu.add(0, 1, 0, menuIconWithText(getResources().getDrawable(R.drawable.ic_baseline_create_new_folder_24), getResources().getString(R.string.create)));
        menu.add(0, 3, 0, menuIconWithText(getResources().getDrawable(R.drawable.ic_baseline_import_export_24), getResources().getString(R.string.Import)));
        menu.add(0, 4, 0, menuIconWithText(getResources().getDrawable(R.drawable.ic_baseline_share_24), getResources().getString(R.string.share)));
        menu.add(0, 5, 0, menuIconWithText(getResources().getDrawable(R.drawable.ic_baseline_settings_24), getResources().getString(R.string.settings)));

        return true;
    }

    private CharSequence menuIconWithText(Drawable r, String title) {
        r.setBounds(0, 0, r.getIntrinsicWidth(), r.getIntrinsicHeight());
        SpannableString sb = new SpannableString(" " + title);
        ImageSpan imageSpan = new ImageSpan(r, ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();
        switch (id){
            case 1:
                System.out.println("Clicked create new folder");
                Intent i1 = new Intent(getApplicationContext(),Profile.class);
                startActivity(i1);
            case 3:
                System.out.println("Clicked import");
                Intent i2 = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(i2);
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}