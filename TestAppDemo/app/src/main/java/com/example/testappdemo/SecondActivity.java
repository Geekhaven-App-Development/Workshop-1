package com.example.testappdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String receivedText = getIntent().getStringExtra("PASSED");

        TextView textView = (TextView) findViewById(R.id.text3);
        textView.setText(receivedText);
    }
}
