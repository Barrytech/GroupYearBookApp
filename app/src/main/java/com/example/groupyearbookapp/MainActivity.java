package com.example.groupyearbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //click button from main to BarryActivity
    Button maintoBar = (Button) findViewById(R.id.open_activity_button);
     btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View v){
            startActivity(new Intent(MainActivity.this, BarryActivity.class));
    }
    });
    //click button to Chris pagee
    Button maintoChris = (Button) findViewById(R.id.open_activity_button);
     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick (View v){
             startActivity(new Intent(MainActivity.this, Husnain.class));
        }
    });

    //click button to Husnain page
    Button maintoHusnain = (Button) findViewById(R.id.open_activity_button);
    btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick (View v){
            startActivity(new Intent(MainActivity.this, Husnain.class));
        }
    });

  }
}