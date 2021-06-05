package com.example.armath;

import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MyActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        TextView firstNumber = findViewById(R.id.firstNum);
        TextView lastNumber = findViewById(R.id.lastNum);
        Button button = findViewById(R.id.startButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber.setText(String.valueOf((int)(Math.random()*5)+1));
                lastNumber.setText(String.valueOf((int)(Math.random()*5)+1));
                firstNumber.setTextColor(getRandomColor());
                lastNumber.setTextColor(getRandomColor());
            }
        });
    }
    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255,rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
    }
}
