package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edKg, edFit, edIn;
    Button bmiAns;
    TextView tvDisplay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edKg = findViewById(R.id.edKg);
        edFit = findViewById(R.id.edFit);
        edIn = findViewById(R.id.edIn);
        bmiAns = findViewById(R.id.bmiAns);
        tvDisplay = findViewById(R.id.tvDisplay);



        bmiAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kgNumber = edKg.getText().toString();
                float wight = Float.parseFloat(kgNumber);

                String fitNumber = edFit.getText().toString();
                float fHeight = Float.parseFloat(fitNumber);

                String insNumber = edIn.getText().toString();
                float inHeight = Float.parseFloat(insNumber);

                float height = (float) ((fHeight * 0.3048) + (inHeight * 0.0254));

                float myBmi = wight / (height*height);

                tvDisplay.setText("Your Bmi is " + myBmi);
            }
        });



    }
}