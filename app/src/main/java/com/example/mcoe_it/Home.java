package com.example.mcoe_it;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.drawerlayout.widget.DrawerLayout;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
//import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;

//This File contains the Code For Loading Home Page


public class Home extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.gallery_1,
            R.drawable.gallery_2,
            R.drawable.gallery_3,
            R.drawable.gallery_4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //Side Bar Nav Functioning
        NavigationView sideNav;
        DrawerLayout drawerLayout;
        Toolbar toolbar;
        drawerLayout = findViewById(R.id.drawLyt);
        sideNav = findViewById(R.id.sideNav);
        toolbar = findViewById(R.id.toolb);
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
                        Intent homeActivity = new Intent(Home.this, Home.class);
                        startActivity(homeActivity);
                        finish();
                        break;

                    case R.id.about:
                         /*Intent about = new Intent(MainActivity.this,<about_activity_name>.class);
                          startActivity(about);*/
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


        //About Redirect Text View
        TextView readMore = findViewById(R.id.readMore);
        readMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //redirecting to about us activity
                //Intent aboutUs = new Intent(MainActivity.this,AbouUs)
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}




