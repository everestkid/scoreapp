package com.divyacollege.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static com.divyacollege.myapplication.MainActivity.KEY_SCORE;

public class ScoreActivity extends AppCompatActivity {
    TextView mScoreTv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        int score = getIntent().getIntExtra(KEY_SCORE,0);
        mScoreTv = findViewById(R.id.score_tv);
        mScoreTv.setText("Your score is :" + score);

    }


}

