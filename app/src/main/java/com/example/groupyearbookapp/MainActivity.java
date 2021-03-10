package com.example.groupyearbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //click button from main to BarryActivity
        Button maintoBar = (Button) findViewById(R.id.barryPage);
        maintoBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BarryActivity.class));
            }
        });

        //click button to Chris pagee
        Button maintoChris = (Button) findViewById(R.id.chrisPageB);
        maintoChris.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChrisActivity.class));
            }
        });

        //click button to Husnain page
        Button maintoHusnain = (Button) findViewById(R.id.husnainPage);
        maintoHusnain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HusnainActivity.class));
            }
        });
    }


}
