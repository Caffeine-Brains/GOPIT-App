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

        //To display related bin
        resultText = (TextView)findViewById(R.id.resultText);
        imageView = (ImageView)findViewById(R.id.imageView);

        Intent resultIntent = getIntent();
        String result = resultIntent.getStringExtra("resultText");

        resultText.setText(result);
        loadRelatedBin(result);

    }

    //Change bin image according to the displaying result
    private void loadRelatedBin(String result){
        if(result.equalsIgnoreCase("glass")){
            imageView.setImageResource(R.drawable.glass);
        }else if(result.equalsIgnoreCase("hazardous")) {
            imageView.setImageResource(R.drawable.harzardous);
        }else if(result.equalsIgnoreCase("metal")) {
            imageView.setImageResource(R.drawable.metal);
        }else if(result.equalsIgnoreCase("organic")) {
            imageView.setImageResource(R.drawable.organic);
        }else if(result.equalsIgnoreCase("plastic")) {
            imageView.setImageResource(R.drawable.plastic);
        }else if(result.equalsIgnoreCase("recyclable")) {
            imageView.setImageResource(R.drawable.recycle);
        }
    }
}