package com.example.mcoe_it;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class ClubsActivity extends AppCompatActivity {
    Dialog appClub,pix,graphix ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);

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