package com.example.imageclassificationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class AboutUs extends AppCompatActivity {

    //Bottom Navigation
    private MeowBottomNavigation bottomNavigation;
    private final int ID_HOME = 1;
    private final int ID_REAL = 2;
    private final int ID_HELP = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        //Bottom Navigation
        bottomNavigation = findViewById(R.id.bottomNavigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(ID_HOME,R.drawable.ic_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_REAL,R.drawable.ic_baseline_camera_alt_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_HELP,R.drawable.ic_baseline_help_outline_24));

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
                        startActivity(new Intent(AboutUs.this, selectOptionActivity.class));
                        break;
                    case ID_REAL:
                        startActivity(new Intent(AboutUs.this, ScanActivity.class));
                        break;
                    case ID_HELP:
                        startActivity(new Intent(AboutUs.this, Help.class));
                        break;
                }
            }
        });

    }
}