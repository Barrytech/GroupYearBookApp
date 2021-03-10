package com.example.groupyearbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;


import android.widget.Button;

public class BarryActivity extends AppCompatActivity {


    Button Shr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        //takes care of the share button
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barry);
        Shr = findViewById(R.id.shareButton);

        Shr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "The body here";
                String shareSub = "The subject here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent, "Share using"));
            }
        });

        //click button to chris page
        Button toChris= (Button) findViewById(R.id.chrisPageB);

        toChris.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(BarryActivity.this, ChrisActivity.class));
            }
        });

        //click button to Husnain page
        Button toHusnain = (Button) findViewById(R.id.husnainPageB);

        toHusnain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(BarryActivity.this, HusnainActivity.class));
            }
        });

        //click button to main activity page
        Button toMain = (Button) findViewById(R.id.mainButton);

        toMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(BarryActivity.this, MainActivity.class));
            }
        });

 
    
}
}