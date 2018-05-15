package com.tagger.taggerapp.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView start_second_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity **", "onCreate() 1");
        start_second_activity = findViewById(R.id.start_second_activity);
        start_second_activity.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart() 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart() 3");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity **", "onResume()  4");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("MainActivity", "onPostResume() 5");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause() 6");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop() 7");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy() 8");
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start_second_activity:
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                break;
        }
    }
}
