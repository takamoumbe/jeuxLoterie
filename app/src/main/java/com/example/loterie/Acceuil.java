package com.example.loterie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Acceuil extends AppCompatActivity {
    private ImageView logo;
    private static int splashTimeOut = 6000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);
        logo = findViewById(R.id.logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Acceuil.this,ChoixLogo.class);
                startActivity(i);
                finish();
            }
        },splashTimeOut);
        Animation myanim = AnimationUtils.loadAnimation(Acceuil.this,R.anim.myanim);
        logo.startAnimation(myanim);
    }
}
