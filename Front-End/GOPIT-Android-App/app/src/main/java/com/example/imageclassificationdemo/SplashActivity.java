package com.example.imageclassificationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    //Initialize variables
    Animation zoomAnim;
    ImageView imgZoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        zoomAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        imgZoom =findViewById(R.id.image);
        imgZoom.startAnimation(zoomAnim);

        //Initialize handler
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            //call select option window
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),selectOptionActivity.class);
                startActivity(intent);
                finish();

            }
        },4000);

    }
}