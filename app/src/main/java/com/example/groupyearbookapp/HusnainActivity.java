package com.example.groupyearbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HusnainActivity extends AppCompatActivity {
       //views
    Button mBtnNotify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_husnain);
        mBtnNotify = findViewById(R.id.btnNotify);

        mBtnNotify.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                pushNotification("App Notification", "App is still running");

            }

            public <view> void onClick(view view) {
                pushNotification("App is running in background");

            }
        });
    }

    private void pushNotification(String app_is_running_in_background) {
    }

    private void pushNotification(String title, String body){
            NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            Notification notification = new Notification.Builder(getApplicationContext())
                    .setContentTitle(title)
                    .setContentText(body)
                    .setSmallIcon(R.drawable.ic_launcher_background)
                    .build();

            notificationManager.notify(0, notification);
        }
    }

