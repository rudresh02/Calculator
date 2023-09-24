package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        EditText input1 = (EditText) findViewById(R.id.editTextNumberSigned);
        EditText input2 = (EditText) findViewById(R.id.editTextNumberSigned2);
        int num1 = Integer.valueOf(input1.getText().toString());
        int num2 = Integer.valueOf(input2.getText().toString());
        if (view.getId() == R.id.clickButton) {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("Result", Float.toString(num1 + num2));
            startActivity(intent);
        } else if (view.getId() == R.id.clickButton2) {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("Result", Float.toString(num1 - num2));
            startActivity(intent);
        } else if (view.getId() == R.id.clickButton3) {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("Result", Float.toString(num1 * num2));
            startActivity(intent);

        } else if (view.getId() == R.id.clickButton4) {
            Intent intent = new Intent(this, MainActivity2.class);
            if (num2 == 0) {
                intent.putExtra("Result", "Please do something else");
                startActivity(intent);
            } else {
                intent.putExtra("Result", Float.toString(num1 / num2));
                startActivity(intent);
            }
        }
    }
}