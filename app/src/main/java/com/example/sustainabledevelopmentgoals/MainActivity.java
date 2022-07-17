package com.example.sustainabledevelopmentgoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button quiz, goals;
        quiz=findViewById(R.id.quizBtn);
        goals=findViewById(R.id.goalsBtn);

        Window window= this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        goals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, GoalsActivity.class);
                startActivity(i);
            }
        });
    }
}