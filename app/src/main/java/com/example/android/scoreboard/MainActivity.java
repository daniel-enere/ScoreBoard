package com.example.android.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreViewForTeamA);
        scoreView.setText(String.valueOf(score));
    }

    public void addTwoPointsForTeamA (View view) {
        teamAScore +=2;
        displayForTeamA(teamAScore);
    }

    public void addThreePointsForTeamA (View view) {
        teamAScore +=3;
        displayForTeamA(teamAScore);
    }

    public void addOnePointForTeamA (View view) {
        teamAScore +=1;
        displayForTeamA(teamAScore);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreViewForTeamB);
        scoreView.setText(String.valueOf(score));
    }

    public void addTwoPointsForTeamB (View view) {
        teamBScore +=2;
        displayForTeamB(teamBScore);
    }

    public void addThreePointsForTeamB (View view) {
        teamBScore +=3;
        displayForTeamB(teamBScore);
    }

    public void addOnePointForTeamB (View view) {
        teamBScore +=1;
        displayForTeamB(teamBScore);
    }

    public void resetPoints (View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamB(teamAScore);
        displayForTeamA(teamBScore);
    }
}
