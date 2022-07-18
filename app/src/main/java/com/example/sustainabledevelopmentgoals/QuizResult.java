package com.example.sustainabledevelopmentgoals;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class QuizResult extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quiz);

        Window window= this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.barra));

        TextView risultato = findViewById(R.id.risultato);
        risultato.setText("Hai totalizzato "+String.valueOf(getIntent().getIntExtra("correct",0))+" risposte esatte");
    }
}
