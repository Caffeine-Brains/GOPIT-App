package com.example.imageclassificationdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivityExtra extends AppCompatActivity {
    private MeowBottomNavigation bottomNavigation;
    private final int ID_HOME = 1;
    private final int ID_REAL = 2;
    private final int ID_HELP = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_extra);

        bottomNavigation = findViewById(R.id.bottomNavigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(ID_HOME,R.drawable.ic_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_REAL,R.drawable.ic_baseline_check_circle_outline_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(ID_HELP,R.drawable.ic_baseline_help_outline_24));

        getSupportFragmentManager().beginTransaction().replace(R.id.root_container, new HomeFragment()).commit();

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

        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragmentSelected = null;
                switch (item.getId()) {
                    case ID_HOME:
                        fragmentSelected = new HomeFragment();
                        break;

                    case ID_REAL:
                        fragmentSelected = new RealTimeFragment();
                        break;

                    case ID_HELP:
                        fragmentSelected = new HelpFragment();
                        break;
                }

                assert fragmentSelected != null;
                getSupportFragmentManager().beginTransaction().replace(R.id.root_container,fragmentSelected).commit();
            }
        });
    }

}

