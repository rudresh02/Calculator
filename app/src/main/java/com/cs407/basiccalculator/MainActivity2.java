package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=(TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String str =intent.getStringExtra("Result");
        textView.setText("Result "+str);
    }
}