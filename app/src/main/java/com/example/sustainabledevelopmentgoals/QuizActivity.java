package com.example.sustainabledevelopmentgoals;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    private TextView questions;
    private TextView question;
    private AppCompatButton option1, option2, option3, option4;
    private AppCompatButton nextBtn;
    private Timer quizTimer;
    private int totalTimeInMins=1;
    private int seconds=0;
    private final List<QuestionsList> questionsList=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ImageView backBtn=findViewById(R.id.backBtn);
        final TextView timer=findViewById(R.id.timer);

        questions=findViewById(R.id.questions);
        question=findViewById(R.id.question);

        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);

        nextBtn=findViewById(R.id.nextBtn);

        startTimer(timer);

    }

    private void startTimer(TextView timerTextView){
        quizTimer= new Timer();
        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(seconds==0){
                    totalTimeInMins--;
                    seconds=59;
                }else if(seconds==0 && totalTimeInMins==0){
                    quizTimer.purge();
                    quizTimer.cancel();
                    Toast.makeText(QuizActivity.this, "Tempo scaduto!", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(QuizActivity.this, QuizResult.class);
                    intent.putExtra("correct",getCorrectAnswer());
                    startActivity(intent);
                    finish();
                }else{
                    seconds--;
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String finalMinutes= String.valueOf(totalTimeInMins);
                        String finalSeconds= String.valueOf(seconds);
                        if(finalMinutes.length()==1){
                            finalMinutes="0"+finalMinutes;
                        }
                        if(finalSeconds.length()==1){
                            finalSeconds="0"+finalSeconds;
                        }
                        timerTextView.setText(finalMinutes+":"+finalSeconds);
                    }
                });
            }
        },1000,1000);
    }

    private int getCorrectAnswer(){
        int correctAnswer=0;
        for (int i=0;i<questionsList.size();i++){
            final String getUserSelectedAnswer=questionsList.get(i).getUserSelectedAnswer();
            final String getAnswer= questionsList.get(i).getAnswer();

            if(getUserSelectedAnswer.equals(getAnswer)){
                correctAnswer++;
            }
        }
        return correctAnswer;
    }

    @Override
    public void onBackPressed() {
        quizTimer.purge();
        quizTimer.cancel();
        //riprendi da 36.48
    }
}
