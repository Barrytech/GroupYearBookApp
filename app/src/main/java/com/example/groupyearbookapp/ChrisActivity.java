package com.example.groupyearbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ChrisActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chris);

        button = findViewById(R.id.webviewButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChrisActivity.this, webView.class);
                startActivity(intent);
            }
        });
        //Button for moving to barrys
        Button ChristoBarry = (Button) findViewById(R.id.barryBook);
        ChristoBarry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChrisActivity.this, BarryActivity.class));
            }
        });
        //Button for moving to husains activity
        Button ChristoHusains = (Button) findViewById(R.id.HusnainBook);
        ChristoHusains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChrisActivity.this, HusnainActivity.class));
            }
        });
    }


}