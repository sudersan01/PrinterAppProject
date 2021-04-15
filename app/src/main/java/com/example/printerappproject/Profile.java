package com.example.printerappproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Profile extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //String List[] = {"WERWERWR", "werwerwerwer", "WErwerwerwe"};

    Spinner spName, spSize, spFilament;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

      /* /////DO NOT DELETE THESE COMMENTED LINES TILL THE END OF THIS PROJECT///////

        Toolbar toolbar;
        toolbar= findViewById(R.id.toolbar);
        toolbar=setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
        }
        */


        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable;
        colorDrawable = new ColorDrawable(Color.parseColor("#4BB1FF"));

        //Using custom backArrow
        @SuppressLint("UseCompatLoadingForDrawables")
        Drawable backArrow = getResources().getDrawable(R.drawable.ic_baseline_arrow_back_24);
        backArrow.setColorFilter(getResources().getColor(R.color.dark_grey), PorterDuff.Mode.SRC_ATOP);


        if(actionBar!=null) {
            actionBar.setBackgroundDrawable(colorDrawable);
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
            actionBar.setHomeAsUpIndicator(backArrow);// set drawable icon

//            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setTitle("Printer Profile");
        }

        //Name spinner//////
        spName   = (Spinner) findViewById(R.id.nameSpin);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapterName = ArrayAdapter.createFromResource(this,R.array.Name, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapterName.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spName.setPrompt("Names list");
        // Apply the adapter to the spinner
        spName.setAdapter(adapterName);
        spName.setPopupBackgroundDrawable(colorDrawable);
        spName.setOnItemSelectedListener(this);

        //Bed Size and shape spinner//////
        spSize   = (Spinner) findViewById(R.id.sizeSpin);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapterSize = ArrayAdapter.createFromResource(this,R.array.Size, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapterSize.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSize.setPrompt("Names list");
        // Apply the adapter to the spinner
        spSize.setAdapter(adapterSize);
        spSize.setPopupBackgroundDrawable(colorDrawable);
        spSize.setOnItemSelectedListener(this);


        //Filament spinner//////
        spFilament   = (Spinner) findViewById(R.id.filamentSpin);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapterFilament = ArrayAdapter.createFromResource(this,R.array.Filament, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapterFilament.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spFilament.setPrompt("Names list");
        // Apply the adapter to the spinner
        spFilament.setAdapter(adapterFilament);
        spFilament.setPopupBackgroundDrawable(colorDrawable);
        spFilament.setOnItemSelectedListener(this);
    }



/*
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

    public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id) {
            // An item was selected. You can retrieve the selected item using
            System.out.println(parent.getItemAtPosition(pos).toString());
        }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }


}