package com.example.intentsmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.Time;
import android.widget.TextView;

public class AfternoonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);
//        Time today = new Time(Time.getCurrentTimezone());
//        today.setToNow();
//        TextView tv=findViewById(R.id.afterView);
//        tv.setText(today.format("%k:%M:%S"));
    }
}
