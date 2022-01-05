package com.divyacollege.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static com.divyacollege.myapplication.MainActivity.KEY_SCORE;

public class ScoreActivity extends AppCompatActivity {
    TextView mScoreTv;
    Button mFinishBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        int score = getIntent().getIntExtra(KEY_SCORE,0);
        mScoreTv = findViewById(R.id.score_tv);
        mFinishBtn = findViewById(R.id.finishBtn);
        mFinishBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                setResult(RESULT_OK,replyIntent);
                finish();

            }
        });
        mScoreTv.setText("Your score is :" + score);

    }


}

