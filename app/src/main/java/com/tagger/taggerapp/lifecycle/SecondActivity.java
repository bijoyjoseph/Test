package com.tagger.taggerapp.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("SecondActivity ","onCreate() 1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SecondActivity ","onStart() 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("SecondActivity ","onRestart() 3");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SecondActivity ","onResume() 4");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("SecondActivity ","onPostResume() 5");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SecondActivity ","onPause() 6");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SecondActivity ","onStop() 7");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity ","onDestroy() 8");
    }
}
