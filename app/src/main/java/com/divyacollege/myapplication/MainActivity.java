package com.divyacollege.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int count = 0;
TextView counter;
final static String KEY_SCORE = "score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = (TextView)findViewById(R.id.count_tv);
        Button countButton = findViewById(R.id.count_button);
        Button submitButton = findViewById(R.id.submit_btn);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,ScoreActivity.class);
                i.putExtra(KEY_SCORE,count);
                startActivity(i);
            }
        });
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_LONG).show();
                count++;
                counter.setText(String.valueOf(count));
            }
        });

        //TODO do this work
    }
}