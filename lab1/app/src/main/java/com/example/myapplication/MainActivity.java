package com.example.myapplication;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.myBG);
        bgElement.setBackgroundColor(Color.CYAN);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {
        button = findViewById(R.id.myButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.myBG);
                int color = ((ColorDrawable) bgElement.getBackground()).getColor();
                if (color == Color.RED) {
                    bgElement.setBackgroundColor(Color.BLUE);
                } else {
                    bgElement.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}
