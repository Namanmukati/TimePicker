package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TimePicker timePicker;
    Button changeTime;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        changeTime = (Button) findViewById(R.id.button);

        //uncomment the below line for 24 hours
        timePicker.setIs24HourView(true);


        changeTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getCurrentTime());

            }
        });

    }

    private String getCurrentTime() {
        String currentTime = "Current Time :"+timePicker.getCurrentHour() + ":"+timePicker.getCurrentMinute();
        return (currentTime);
    }
}