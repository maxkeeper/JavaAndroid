package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod(){
        Button button = (Button) findViewById(R.id.rollButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int rollResult = random.nextInt(6) + 1;
                TextView diceResult = (TextView) findViewById(R.id.diceResult);
                diceResult.setText(Integer.toString(rollResult));
                ImageView imgVoronenkoScreen = (ImageView) findViewById(R.id.diceImg);
                switch (rollResult){
                    case 1:
                        imgVoronenkoScreen.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imgVoronenkoScreen.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imgVoronenkoScreen.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imgVoronenkoScreen.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imgVoronenkoScreen.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imgVoronenkoScreen.setImageResource(R.drawable.dice6);
                        break;
                }
            }
        });
    }
}
