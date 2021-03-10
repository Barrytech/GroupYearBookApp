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

        button.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){
                Intent intent = new Intent((ChrisActivity.this, WebView.class);
//                startAtivity(intent);
             }
            });
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chris);

        button = findViewById(R.id.HusnainBook);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(View v){
                Intent intent = new Intent(ChrisActivity.this, HusnainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chris);

        button = findViewById(R.id.barryBook);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v) {
                Intent intent = new Intent(ChrisActivity.this, BarryActivity.class);
                startActivity(intent);
            }
        });
    }
}