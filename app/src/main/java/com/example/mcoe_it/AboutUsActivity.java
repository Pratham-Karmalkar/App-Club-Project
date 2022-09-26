package com.example.mcoe_it;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_about_us);

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
                        Intent homeActivity = new Intent(AboutUsActivity.this, Home.class);
                        startActivity(homeActivity);
                        break;

                    case R.id.about:
                        Intent about = new Intent(AboutUsActivity.this,AboutUsActivity.class);
                        startActivity(about);
                        break;

                    case R.id.labs:
                        Intent labs = new Intent(AboutUsActivity.this,LabsActivity.class);
                        startActivity(labs);
                        break;

                    case R.id.gall:
                        Intent gallery = new Intent(AboutUsActivity.this,GalleryActivity.class);
                        startActivity(gallery);
                        break;


                    case R.id.clubs:
                        Intent clubs = new Intent(AboutUsActivity.this,ClubsActivity.class);
                        startActivity(clubs);
                        break;


                    case R.id.facultyInfo:
                        Intent facInfo = new Intent(AboutUsActivity.this,Faculty.class);
                          startActivity(facInfo);;
                        break;


                    case R.id.curriculum:
                        Intent curriculum = new Intent(AboutUsActivity.this,CurriculumActivity.class);
                        startActivity(curriculum);
                        break;

                }

                return false;
            }


        });


    }
}