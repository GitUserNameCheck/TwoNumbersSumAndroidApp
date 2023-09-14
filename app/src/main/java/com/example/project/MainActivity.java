package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText a, b;
    TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.numA);
        b = findViewById(R.id.numB);
        sum = findViewById(R.id.sum);
    }

    public void onClick(View v){
        String strA = a.getText().toString();
        String strB = b.getText().toString();
//        Log.d("mytag", strA);
        try {
            double dA = Double.parseDouble(strA);
            double dB = Double.parseDouble(strB);

            String strSum = Double.toString(dA + dB);
            sum.setText(strSum);

        } catch (NumberFormatException e){
            sum.setText("error");
        }
    }


}