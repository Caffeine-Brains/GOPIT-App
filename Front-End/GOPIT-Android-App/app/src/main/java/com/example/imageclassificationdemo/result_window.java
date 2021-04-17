package com.example.imageclassificationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class result_window extends AppCompatActivity {
    TextView resultText;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_window);

        resultText = (TextView)findViewById(R.id.resultText);
        imageView = (ImageView)findViewById(R.id.imageView);

        Intent resultIntent = getIntent();
        String result = resultIntent.getStringExtra("resultText");

        resultText.setText(result);

    }
}