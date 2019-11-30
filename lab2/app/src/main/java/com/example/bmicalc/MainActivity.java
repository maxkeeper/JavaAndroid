package com.example.bmicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }
    public void myButtonListenerMethod(){
        Button button = (Button) findViewById(R.id.buttonCalc);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText heightText = (EditText) findViewById(R.id.editM);
                String heightStr = heightText.getText().toString();
                double height = Double.parseDouble(heightStr);

                final EditText weightText = (EditText) findViewById(R.id.editKg);
                String weightStr = weightText.getText().toString();
                double weight = Double.parseDouble(weightStr);

                double BMI = (weight)/(height*height);
                final EditText BMIResult = (EditText) findViewById(R.id.Result);
                BMIResult.setText(String.format("%f", BMI).substring(0,4));
                String BMICat;
                if (BMI < 15)
                    BMICat = "Very severely underweight";
                else if (BMI < 16)
                    BMICat = "Severely underweight";
                else if (BMI < 18.5)
                    BMICat = "Underweight";
                else if (BMI < 25)
                    BMICat = "Normal";
                else if (BMI < 30)
                    BMICat = "Overweight";
                else if (BMI < 35)
                    BMICat = "Obese Class 1 – Moderately Obese";
                else if (BMI < 40)
                    BMICat = "Obese Class 2 - Severely Obese";
                else
                    BMICat = "Obese Class 3 - Very Severely Obese";
                final TextView BMICateg = (TextView) findViewById(R.id.bmiCat);
                BMICateg.setText(BMICat);
            }
        });
    }
}
