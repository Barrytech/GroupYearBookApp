package com.example.groupyearbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BarryActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_barry);
//    }
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barry);
        bt = (Button)findViewById(R.id.webviewButton);
        bt.setOnClickListner(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "The body here";
                String shareSub = "The subject here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.creeateChooseer(myIntent, "Share using"));
            }
        });

        //click button to chris pagee
        Button nextbut = (Button)findViewById(R.id.open_activity_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BarryActivity.this, ChrisActivity.class));
            }
        });
        //click button to Chris page
        Button nextbut = (Button)findViewById(R.id.open_activity_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BarryActivity.this, Husnain.class));
            }
        });

        //click button to main activity page
        Button nextbut = (Button)findViewById(R.id.open_activity_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BarryActivity.this, MainActivity.class));
            }
        });
}