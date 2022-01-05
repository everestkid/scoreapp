package com.divyacollege.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int count = 0;
TextView mScoreTv;
final static String KEY_SCORE = "score";
final static int REQUEST_CODE = 3;

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","On Pause Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActvity","On Start Called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActvity","On Resume Called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActvity","On Stop Called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActvity","On Destroy Called");

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        
        setContentView(R.layout.activity_main);
        mScoreTv = (TextView)findViewById(R.id.count_tv);
        Button countButton = findViewById(R.id.count_button);
        Button submitButton = findViewById(R.id.submit_btn);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,ScoreActivity.class);
                i.putExtra(KEY_SCORE,count);
//                startActivity(i);
                startActivityForResult(i,REQUEST_CODE);
            }
        });
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_LONG).show();
                count++;
                mScoreTv.setText(String.valueOf(count));
            }
        });





        //TODO do this work
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){
                count = 0;
                mScoreTv.setText(String.valueOf(count));
            }
        }

    }
}