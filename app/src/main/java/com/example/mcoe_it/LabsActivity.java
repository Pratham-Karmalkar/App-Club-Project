package com.example.mcoe_it;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class LabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_labs);
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
                        Intent homeActivity = new Intent(LabsActivity.this, Home.class);
                        startActivity(homeActivity);
                        finish();
                        break;

                    case R.id.about:
                        Intent about = new Intent(LabsActivity.this,AboutUsActivity.class);
                        startActivity(about);
                        finish();
                        break;


                    case R.id.labs:
                        Intent labs = new Intent(LabsActivity.this,LabsActivity.class);
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

    }

}