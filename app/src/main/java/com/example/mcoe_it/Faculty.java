package com.example.mcoe_it;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;


public class Faculty extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.card1,
            R.drawable.card2,
            R.drawable.card3,
            R.drawable.card4,
            R.drawable.card5,
            R.drawable.card6,
            R.drawable.card7,
            R.drawable.card8,
            R.drawable.card9,
            R.drawable.card10,
            R.drawable.card11,
            R.drawable.card12,
            R.drawable.card14,
            R.drawable.card15,
            R.drawable.card16,
            R.drawable.card17,
            R.drawable.card18,
            R.drawable.card19,
            R.drawable.card20,
            R.drawable.card21,
            R.drawable.card22,
            R.drawable.card23,
            R.drawable.card24,
            R.drawable.card25,
            R.drawable.card26,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        setContentView(R.layout.activity_faculty);
        NavigationView sideNav;
        DrawerLayout drawerLayout;
        Toolbar toolbar;
        drawerLayout = findViewById(R.id.drawFCT);
        sideNav = findViewById(R.id.sideNavfc);
        toolbar = findViewById(R.id.toolfc);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //Redirecting from sidebar to other activities
        sideNav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                switch (itemId) {
                    case R.id.homeAct:
                        Intent homeActivity = new Intent(Faculty.this, Home.class);
                        startActivity(homeActivity);
                        finish();
                        break;

                    case R.id.about:
                        Intent about = new Intent(Faculty.this, AboutUsActivity.class);
                        startActivity(about);
                        finish();
                        break;


                    case R.id.labs:
                        Intent labs = new Intent(Faculty.this, LabsActivity.class);
                        startActivity(labs);
                        finish();
                        break;


                    case R.id.gall:
                        /*Intent gallery = new Intent(MainActivity.this,<gallery_activity_name>.class);
                          startActivity(gallery);*/
                        finish();
                        break;


                    case R.id.clubs:
                        /*Intent clubs = new Intent(MainActivity.this,<clubs_activity_name>.class);
                          startActivity(clubs);*/
                        finish();
                        break;


                    case R.id.facultyInfo:
                        /*Intent facInfo = new Intent(MainActivity.this,<facInfo_activity_name>.class);
                          startActivity(facInfo);*/
                        finish();
                        break;


                    case R.id.curriculum:
                        /*Intent curriculum = new Intent(MainActivity.this,<curriculum_activity_name>.class);
                          startActivity(curriculum);*/
                        finish();
                        break;

                }

                return false;
            }


        });

        //Slider View
        sliderView = findViewById(R.id.imageSlider);
        SliderAdapter sliderAdapter = new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

    }

}