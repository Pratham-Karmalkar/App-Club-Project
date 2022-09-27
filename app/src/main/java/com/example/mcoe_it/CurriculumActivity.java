package com.example.mcoe_it;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class CurriculumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_curriculum);

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
                        Intent homeActivity = new Intent(CurriculumActivity.this, Home.class);
                        startActivity(homeActivity);
                        break;

                    case R.id.about:
                        Intent about = new Intent(CurriculumActivity.this, AboutUsActivity.class);
                        startActivity(about);
                        break;

                    case R.id.labs:
                        Intent labs = new Intent(CurriculumActivity.this, LabsActivity.class);
                        startActivity(labs);
                        break;

                    case R.id.gall:
                        Intent gallery = new Intent(CurriculumActivity.this, GalleryActivity.class);
                        startActivity(gallery);
                        break;


                    case R.id.clubs:
                        Intent clubs = new Intent(CurriculumActivity.this,ClubsActivity.class);
                        startActivity(clubs);
                        break;


                    case R.id.facultyInfo:
                        Intent facInfo = new Intent(CurriculumActivity.this,Faculty.class);
                          startActivity(facInfo);
                        break;


                    case R.id.curriculum:
                        Intent curriculum = new Intent(CurriculumActivity .this,CurriculumActivity.class);
                        startActivity(curriculum);
                        break;
                }

                return false;
            }


        });

        //Downloads  Syllabus

        TextView dwnFe = findViewById(R.id.downloadFE);
        dwnFe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://moderncoe.edu.in/pdf/FisEng/CurriculumAndAcademicCalendar/SyllabusStructure/First_Year_Engineering_2019_Patt.Syllabus_05.072019.pdf");
                Intent intent= new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        TextView dwnSE = findViewById(R.id.downloadSE);
        dwnSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://moderncoe.edu.in/pdf/InfoTechpdf/CurriculumAndAcademicCalendar/SyllabusStructure/6_SE_%20INFORMATION%20TECHNOLOGY_%202019%20Pattern.pdf");
                Intent intent= new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        TextView dwnTE = findViewById(R.id.downloadTE);
        dwnTE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://moderncoe.edu.in/pdf/InfoTechpdf/CurriculumAndAcademicCalendar/SyllabusStructure/T.E._INFORMATION_TECHNOLOGY_2019_PATTERN-3.pdf");
                Intent intent= new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        TextView dwnBE = findViewById(R.id.downloadBE);
        dwnBE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://moderncoe.edu.in/pdf/InfoTechpdf/CurriculumAndAcademicCalendar/SyllabusStructure/BE_INFORMATION_TECHNOLOGY_2019_PATTERN.pdf");
                Intent intent= new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}