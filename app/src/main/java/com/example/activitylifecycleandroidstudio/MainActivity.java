package com.example.activitylifecycleandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life Cycle Events: ", "In OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle Events: ", "In OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life Cycle Events: ", "In OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle Events: ", "In OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle Events: ", "In OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle Events: ", "In OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle Events: ", "In OnRestart");
    }
}