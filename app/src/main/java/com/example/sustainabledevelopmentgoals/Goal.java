package com.example.sustainabledevelopmentgoals;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Goal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal2);

        ScrollView layout = findViewById(R.id.layoutGoal2);

        ImageView img_goal= (ImageView) findViewById(R.id.img_goal2);
      //  TextView nome_goal= (TextView) findViewById(R.id.nome_goal);
        TextView descr_goal=findViewById(R.id.descr_goal2);

        Intent intent = getIntent();
        String caller= intent.getStringExtra("caller");

        Window window=this.getWindow();

        switch (caller){
            case "c1": {
                img_goal.setImageDrawable(getDrawable(R.drawable.goal1nuovo));
               // nome_goal.setText("Fine della povertà");
                descr_goal.setText("Descrizione goal 1");
                layout.setBackgroundColor(getResources().getColor(R.color.goal1));
                window.setStatusBarColor(getResources().getColor(R.color.goal1));
              //  nome_goal.setText("Porre fine ad ogni forma di povertà");
                descr_goal.setText("Aumentare i redditi dei più poveri, garantire l'accesso ai servizi di base e proteggere tutti dai disastri naturali e causati dall'uomo");
                break;
            }
            case "c2": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c2));
             //   nome_goal.setText("Stop alla fame");
                descr_goal.setText("Descrizione goal 2");
                layout.setBackgroundColor(getResources().getColor(R.color.goal2));
                window.setStatusBarColor(getResources().getColor(R.color.goal2));
                break;
            }
            case "c3": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c3));
             //   nome_goal.setText("Benessere e buona salute");
                descr_goal.setText("Descrizione goal 3");
                layout.setBackgroundColor(getResources().getColor(R.color.goal3));
                window.setStatusBarColor(getResources().getColor(R.color.goal3));
                break;

            }
            case "c4": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c4));
              //  nome_goal.setText("Educazione di qualità");
                descr_goal.setText("Descrizione goal 4");
                layout.setBackgroundColor(getResources().getColor(R.color.goal4));
                window.setStatusBarColor(getResources().getColor(R.color.goal4));
                break;

            }
            case "c5": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c5));
              //  nome_goal.setText("Fine della povertà");
                descr_goal.setText("Descrizione goal 1");
                layout.setBackgroundColor(getResources().getColor(R.color.goal5));
                window.setStatusBarColor(getResources().getColor(R.color.goal5));
                break;
            }
            case "c6": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c6));
               // nome_goal.setText("Stop alla fame");
                descr_goal.setText("Descrizione goal 2");
                layout.setBackgroundColor(getResources().getColor(R.color.goal6));
                window.setStatusBarColor(getResources().getColor(R.color.goal6));
                break;
            }
            case "c7": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c7));
             //   nome_goal.setText("Benessere e buona salute");
                descr_goal.setText("Descrizione goal 3");
                layout.setBackgroundColor(getResources().getColor(R.color.goal7));
                window.setStatusBarColor(getResources().getColor(R.color.goal7));
                break;
            }
            case "c8": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c8));
              //  nome_goal.setText("Educazione di qualità");
                descr_goal.setText("Descrizione goal 4");
                layout.setBackgroundColor(getResources().getColor(R.color.goal8));
                window.setStatusBarColor(getResources().getColor(R.color.goal8));
                break;
            }
            case "c9": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c9));
             //   nome_goal.setText("Fine della povertà");
                descr_goal.setText("Descrizione goal 1");
                layout.setBackgroundColor(getResources().getColor(R.color.goal9));
                window.setStatusBarColor(getResources().getColor(R.color.goal9));
                break;
            }
            case "c10": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c10));
              //  nome_goal.setText("Stop alla fame");
                descr_goal.setText("Descrizione goal 2");
                layout.setBackgroundColor(getResources().getColor(R.color.goal10));
                window.setStatusBarColor(getResources().getColor(R.color.goal10));
                break;

            }
            case "c11": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c11));
             //   nome_goal.setText("Benessere e buona salute");
                descr_goal.setText("Descrizione goal 3");
                layout.setBackgroundColor(getResources().getColor(R.color.goal11));
                window.setStatusBarColor(getResources().getColor(R.color.goal11));
                break;
            }
            case "c12": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c12));
             //   nome_goal.setText("Educazione di qualità");
                descr_goal.setText("Descrizione goal 4");
                layout.setBackgroundColor(getResources().getColor(R.color.goal12));
                window.setStatusBarColor(getResources().getColor(R.color.goal12));
                break;
            }
            case "c13": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c13));
           //     nome_goal.setText("Fine della povertà");
                descr_goal.setText("Descrizione goal 1");
                layout.setBackgroundColor(getResources().getColor(R.color.goal13));
                window.setStatusBarColor(getResources().getColor(R.color.goal13));
                break;
            }
            case "c14": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c14));
             //   nome_goal.setText("Stop alla fame");
                descr_goal.setText("Descrizione goal 2");
                layout.setBackgroundColor(getResources().getColor(R.color.goal14));
                window.setStatusBarColor(getResources().getColor(R.color.goal14));
                break;
            }
            case "c15": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c15));
               // nome_goal.setText("Benessere e buona salute");
                descr_goal.setText("Descrizione goal 3");
                layout.setBackgroundColor(getResources().getColor(R.color.goal15));
                window.setStatusBarColor(getResources().getColor(R.color.goal15));
                break;
            }
            case "c16": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c16));
              //  nome_goal.setText("Educazione di qualità");
                descr_goal.setText("Descrizione goal 16");
                layout.setBackgroundColor(getResources().getColor(R.color.goal16));
                window.setStatusBarColor(getResources().getColor(R.color.goal16));
                break;
            }
            case "c17": {
                img_goal.setImageDrawable(getDrawable(R.drawable.c17));
            //    nome_goal.setText("Educazione di qualità");
                descr_goal.setText("Descrizione goal 17");
                layout.setBackgroundColor(getResources().getColor(R.color.goal17));
                window.setStatusBarColor(getResources().getColor(R.color.goal17));
                break;
            }
        }

    }
}
