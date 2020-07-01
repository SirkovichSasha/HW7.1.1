package com.example.intentsmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    Button syncronize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button syncronize=findViewById(R.id.syncronizeBtn);
        syncronize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GregorianCalendar gcalendar = new GregorianCalendar();
                int time=gcalendar.get(Calendar.HOUR);
                Intent intent = new Intent(Intent.ACTION_SYNC);

                if (time>=6&&time<14)
                    intent.setData(Uri.parse("http://morning"));
               else {
                    if (time>=14&&time<15)
                        intent.setData(Uri.parse("http://afternoon"));
                    else{
                            intent.setData(Uri.parse("http://evening"));
                    }
                }
                startActivity(intent);
            }
        });
    }


}
