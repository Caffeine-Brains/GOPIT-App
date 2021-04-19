package com.example.imageclassificationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class result_window extends AppCompatActivity {

    //Initialize variables
    TextView resultText;
    ImageView imageView;
    Animation animation;

    //Bottom Navigation
    private MeowBottomNavigation bottomNavigation;
    private final int ID_HOME = 1;
    private final int ID_REAL = 2;
    private final int ID_HELP = 3;

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
        rotateBin();

        //Bottom Navigation
        bottomNavigation = findViewById(R.id.bottomNavigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(ID_HOME,R.drawable.home_icon));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_REAL,R.drawable.camera_icon_2));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_HELP,R.drawable.help_icon));

        //Bottom Navigation Activities
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {

            }
        });

        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {

            }
        });

        //Bottom Navigation
        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                switch (item.getId()) {
                    case ID_HOME:
                        startActivity(new Intent(result_window.this, selectOptionActivity.class));
                        break;
                    case ID_REAL:
                        startActivity(new Intent(result_window.this, ScanActivity.class));
                        break;
                    case ID_HELP:
                        startActivity(new Intent(result_window.this, Help.class));
                        break;
                }
            }
        });

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

    //Adding rotate option to the bin
    public void rotateBin(){
        animation= AnimationUtils.loadAnimation(this,R.anim.rotate_bin);
        imageView.startAnimation(animation);
    }
}