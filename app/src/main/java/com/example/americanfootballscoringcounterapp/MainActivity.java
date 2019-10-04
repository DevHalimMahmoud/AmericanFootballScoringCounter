package com.example.americanfootballscoringcounterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addA1(View view) {
        scoreA += 1;
        displayA();
    }

    public void addA2(View view) {
        scoreA += 2;
        displayA();
    }

    public void addA3(View view) {
        scoreA += 3;
        displayA();
    }

    public void addA6(View view) {
        scoreA += 6;
        displayA();
    }

    public void addB1(View view) {
        scoreB += 1;
        displayB();
    }

    public void addB2(View view) {
        scoreB += 2;
        displayB();
    }

    public void addB3(View view) {
        scoreB += 3;
        displayB();
    }

    public void addB6(View view) {
        scoreB += 6;
        displayB();
    }

    public void displayA() {
        TextView teamA = findViewById(R.id.scoreA);
        teamA.setText(String.valueOf(scoreA));

    }

    public void displayB() {
        TextView teamB = findViewById(R.id.scoreB);
        teamB.setText(String.valueOf(scoreB));

    }

    public void reset(View view) {
        scoreB = 0;
        scoreA = 0;
        TextView teamB = findViewById(R.id.scoreB);
        TextView teamA = findViewById(R.id.scoreA);
        teamA.setText(String.valueOf(scoreA));
        teamB.setText(String.valueOf(scoreB));

        EditText nameA = findViewById(R.id.teamNameA);
        EditText nameB = findViewById(R.id.teamNameB);
        nameA.setText("");
        nameB.setText("");
    }
}

