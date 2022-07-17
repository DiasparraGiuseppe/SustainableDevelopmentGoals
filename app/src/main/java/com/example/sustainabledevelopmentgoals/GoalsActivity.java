package com.example.sustainabledevelopmentgoals;

import android.os.Bundle;
import android.view.Window;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GoalsActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Window window= this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.black));

        ImageView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17;
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);
        c8=findViewById(R.id.c8);
        c9=findViewById(R.id.c9);
        c10=findViewById(R.id.c10);
        c11=findViewById(R.id.c11);
        c12=findViewById(R.id.c12);
        c13=findViewById(R.id.c13);
        c14=findViewById(R.id.c14);
        c15=findViewById(R.id.c15);
        c16=findViewById(R.id.c16);
        c17=findViewById(R.id.c17);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c1");
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c2");
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c3");
                startActivity(intent);
            }

        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c4");
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c5");
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c6");
                startActivity(intent);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c7");
                startActivity(intent);
            }

        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c8");
                startActivity(intent);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c9");
                startActivity(intent);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c10");
                startActivity(intent);
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c11");
                startActivity(intent);
            }

        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c12");
                startActivity(intent);
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c13");
                startActivity(intent);
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c14");
                startActivity(intent);
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c15");
                startActivity(intent);
            }

        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c16");
                startActivity(intent);
            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GoalsActivity.this,Goal.class);
                intent.putExtra("caller","c17");
                startActivity(intent);
            }
        });

    }
}
