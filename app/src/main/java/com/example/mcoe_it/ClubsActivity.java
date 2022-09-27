package com.example.mcoe_it;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class ClubsActivity extends AppCompatActivity {
    Dialog appClub,pix,graphix ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);



        //side Bar

        NavigationView sideNav;
        DrawerLayout drawerLayout;
        Toolbar toolbar;
        drawerLayout = findViewById(R.id.drawLyt);
        sideNav = findViewById(R.id.sideNav);
        toolbar = findViewById(R.id.toolb);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        sideNav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                switch (itemId) {
                    case R.id.homeAct:
                        Intent homeActivity = new Intent(ClubsActivity.this, Home.class);
                        startActivity(homeActivity);
                        break;

                    case R.id.about:
                        Intent about = new Intent(ClubsActivity.this,AboutUsActivity.class);
                        startActivity(about);
                        break;


                    case R.id.labs:
                        Intent labs = new Intent(ClubsActivity.this,LabsActivity.class);
                        startActivity(labs);
                        break;


                    case R.id.gall:
                        Intent gallery = new Intent(ClubsActivity.this,GalleryActivity.class);
                        startActivity(gallery);
                        break;


                    case R.id.clubs:
                        Intent clubs = new Intent(ClubsActivity.this,ClubsActivity.class);
                        startActivity(clubs);
                        break;


                    case R.id.facultyInfo:
                        Intent facInfo = new Intent(ClubsActivity.this,Faculty.class);
                        startActivity(facInfo);
                        break;


                    case R.id.curriculum:
                        Intent curriculum = new Intent(ClubsActivity.this,CurriculumActivity.class);
                        startActivity(curriculum);
                        break;


                }

                return false;
            }


        });


        //Dialogue Box
        appClub =new Dialog(this);
        pix=new Dialog(this);
        graphix =new Dialog(this);



        Button clsApp,clsPix,clsGra,knowApp,knowPix,knowGraphix;




        //Buttons Opening Dialogue Box
        knowApp = findViewById(R.id.appClubDialogue);
        knowPix = findViewById(R.id.pixinsightClubDialogue);
        knowGraphix = findViewById(R.id.graphixClubDialogue);

        //Setting on click listener
        appClub.setContentView(R.layout.app_club_popup);

        knowApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                appClub.show();
                Window window = appClub.getWindow();
                window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
            }
        });


        pix.setContentView(R.layout.pix_popup);
            knowPix.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    pix.show();
                    Window window = pix.getWindow();
                    window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
                }
            });

         graphix.setContentView(R.layout.graphix_popup);
         knowGraphix.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 graphix.show();
                 Window window = graphix.getWindow();
                 window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
             }
         });


        clsApp = appClub.findViewById(R.id.closeBt);
        clsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appClub.dismiss();
            }
        });


        clsPix = pix.findViewById(R.id.closeBtPix);
        clsPix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pix.dismiss();
            }
        });


        clsGra = graphix.findViewById(R.id.closeBtPhix);
        clsGra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                graphix.dismiss();
            }
        });


    }



}