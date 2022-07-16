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
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Goal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal2);

        ScrollView layout = findViewById(R.id.layoutGoal2);

        ImageView img_goal= (ImageView) findViewById(R.id.img_goal2);
        TextView descr_goal=findViewById(R.id.descr_goal2);
        YouTubePlayerView youTubePlayerView= findViewById(R.id.video);
        getLifecycle().addObserver(youTubePlayerView);

        Intent intent = getIntent();
        String caller= intent.getStringExtra("caller");

        Window window=this.getWindow();

        switch (caller){
            case "c1": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="6h6MU0eg8yw";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal1));
                layout.setBackgroundColor(getResources().getColor(R.color.goal1));
                window.setStatusBarColor(getResources().getColor(R.color.goal1));
                descr_goal.setText("Aumentare i redditi dei più poveri, garantire l'accesso ai servizi di base e proteggere tutti dai disastri naturali e causati dall'uomo");

                break;
            }
            case "c2": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="ldaFVRQHjv0";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal2));
                descr_goal.setText("Porre fine alla fame, raggiungere la sicurezza alimentare, migliorare la nutrizione e promuovere un’agricoltura sostenibile");
                layout.setBackgroundColor(getResources().getColor(R.color.goal2));
                window.setStatusBarColor(getResources().getColor(R.color.goal2));
                break;
            }
            case "c3": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="7GywgfYPLQE";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal3));
                descr_goal.setText("Assicurare la salute e il benessere per tutti a tutte le età");
                layout.setBackgroundColor(getResources().getColor(R.color.goal3));
                window.setStatusBarColor(getResources().getColor(R.color.goal3));
                break;

            }
            case "c4": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="eX5nieFez3o";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal4));
                descr_goal.setText("Fornire un’istruzione di qualità, equa e inclusiva, e opportunità di apprendimento per tutti");
                layout.setBackgroundColor(getResources().getColor(R.color.goal4));
                window.setStatusBarColor(getResources().getColor(R.color.goal4));
                break;

            }
            case "c5": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="khOUggPqFcU";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal5));
                descr_goal.setText("Raggiungere l’uguaglianza di genere e l’empowerment di tutte le donne e le ragazze");
                layout.setBackgroundColor(getResources().getColor(R.color.goal5));
                window.setStatusBarColor(getResources().getColor(R.color.goal5));
                break;
            }
            case "c6": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="5qUuGgn07Xg";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal6));
                descr_goal.setText("Garantire a tutti la disponibilità e la gestione sostenibile dell’acqua e delle strutture igienico-sanitarie");
                layout.setBackgroundColor(getResources().getColor(R.color.goal6));
                window.setStatusBarColor(getResources().getColor(R.color.goal6));
                break;
            }
            case "c7": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="ICokSnMxn3Q";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal7));
                descr_goal.setText("Assicurare a tutti l’accesso a sistemi di energia economici, affidabili,sostenibili e moderni");
                layout.setBackgroundColor(getResources().getColor(R.color.goal7));
                window.setStatusBarColor(getResources().getColor(R.color.goal7));
                break;
            }
            case "c8": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="XF-Ko5xNvfw";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal8));
                descr_goal.setText("Incentivare una crescita economica duratura, inclusiva e sostenibile,un’occupazione piena e produttiva e un lavoro dignitoso per tutti");
                layout.setBackgroundColor(getResources().getColor(R.color.goal8));
                window.setStatusBarColor(getResources().getColor(R.color.goal8));
                break;
            }
            case "c9": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="Vpa7CE8QCiA";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal9));
                descr_goal.setText("Costruire infrastrutture resilienti e promuovere l’innovazione e una industrializzazione equa, responsabile e sostenibile");
                layout.setBackgroundColor(getResources().getColor(R.color.goal9));
                window.setStatusBarColor(getResources().getColor(R.color.goal9));
                break;
            }
            case "c10": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="6aAJl8RhHew";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal10));
                descr_goal.setText("Ridurre le diseguaglianze all’interno e fra le nazioni");
                layout.setBackgroundColor(getResources().getColor(R.color.goal10));
                window.setStatusBarColor(getResources().getColor(R.color.goal10));
                break;

            }
            case "c11": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="jTwmXoePSxs";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal11));
                descr_goal.setText("Rendere le città e gli insediamenti umani inclusivi, sicuri, duraturi,sostenibili");
                layout.setBackgroundColor(getResources().getColor(R.color.goal11));
                window.setStatusBarColor(getResources().getColor(R.color.goal11));
                break;
            }
            case "c12": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="9_sD-JqsJys";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal12));
                descr_goal.setText("Garantire modelli sostenibili di produzione e di consumo");
                layout.setBackgroundColor(getResources().getColor(R.color.goal12));
                window.setStatusBarColor(getResources().getColor(R.color.goal12));
                break;
            }
            case "c13": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="LxSG5_xp_ho";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal13));
                descr_goal.setText("Adottare misure urgenti per combattere il cambiamento climatico e le sue conseguenze");
                layout.setBackgroundColor(getResources().getColor(R.color.goal13));
                window.setStatusBarColor(getResources().getColor(R.color.goal13));
                break;
            }
            case "c14": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="K2t7qjIzoNc";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal14));
                descr_goal.setText("Conservare e utilizzare in modo durevole gli oceani, i mari e le risorse marine per lo sviluppo sostenibile");
                layout.setBackgroundColor(getResources().getColor(R.color.goal14));
                window.setStatusBarColor(getResources().getColor(R.color.goal14));
                break;
            }
            case "c15": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="vDDFM02x3Fk";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal15));
                descr_goal.setText("Proteggere, ripristinare, favorire un uso sostenibile dell’ecosistema terrestre, gestire sostenibilmente le foreste, contrastare la desertificazione, arrestare e far retrocedere il degrado del territorio e fermare la perdita di diversità biologica");
                layout.setBackgroundColor(getResources().getColor(R.color.goal15));
                window.setStatusBarColor(getResources().getColor(R.color.goal15));
                break;
            }
            case "c16": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="1clrr10vXw8";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal16));
                descr_goal.setText("Promuovere società pacifiche e più inclusive per uno sviluppo sostenibile, offrire l’accesso alla giustizia per tutti e creare organismi efficienti, responsabili e inclusivi a tutti i livelli");
                layout.setBackgroundColor(getResources().getColor(R.color.goal16));
                window.setStatusBarColor(getResources().getColor(R.color.goal16));
                break;
            }
            case "c17": {
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(YouTubePlayer youTubePlayer) {
                        String id="XE7VaXHY1Fs";
                        youTubePlayer.loadVideo(id,0);
                    }
                });
                img_goal.setImageDrawable(getDrawable(R.drawable.goal17));
                descr_goal.setText("Rafforzare il partenariato mondiale e i mezzi di attuazione per lo sviluppo sostenibile");
                layout.setBackgroundColor(getResources().getColor(R.color.goal17));
                window.setStatusBarColor(getResources().getColor(R.color.goal17));
                break;
            }
        }



    }
}
