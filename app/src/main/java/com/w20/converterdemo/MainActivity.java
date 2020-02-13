package com.w20.converterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText cadTxt;
    EditText usdTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadTxt = findViewById(R.id.cadTxt);
        usdTxt = findViewById(R.id.usdTxt);
    }

    public void convert(View view) {
//        if (!cadTxt.getText().toString().isEmpty() || !usdTxt.getText().toString().isEmpty()) {
//
//        }
        if (!cadTxt.getText().toString().isEmpty() && usdTxt.getText().toString().isEmpty()) {
            Double cad = Double.parseDouble(cadTxt.getText().toString());
            usdTxt.setText(String.valueOf(cad / 1.3));
        } else if (cadTxt.getText().toString().isEmpty() && !usdTxt.getText().toString().isEmpty()) {
            Double usd = Double.parseDouble(usdTxt.getText().toString());
            cadTxt.setText(String.valueOf(usd * 1.3));
        }
    }
}
