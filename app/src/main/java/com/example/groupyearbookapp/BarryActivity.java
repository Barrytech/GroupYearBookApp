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
    //webview on my page
    private theWebEmb WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        theWebEmb = (WebView) findViewById(R.id.theWebEmb);
        theWebEmb.setWebViewClient(new WebViewClient());
        theWebEmb.loadUrl("https://www.google.com/?client=safari");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barry);
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListneer(new View.OnClickListener() {
        bt = (Button)findViewById(R.id.webviewButton);
        bt.setOnClickListner(new View.OnClickListener() {
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
        Button toChris= (Button) findViewById(R.id.open_activity_button);

        toChris.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(BarryActivity.this, ChrisActivity.class));
            }
        });

        //click button to Husnain page
        Button toHusnain = (Button) findViewById(R.id.open_activity_button);

        toHusnain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(BarryActivity.this, Husnain.class));
            }
        });

        //click button to main activity page
        Button toMain = (Button) findViewById(R.id.open_activity_button);

        toMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(BarryActivity.this, MainActivity.class));
            }
        });

    }
}