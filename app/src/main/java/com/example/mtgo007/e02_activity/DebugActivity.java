package com.example.mtgo007.e02_activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by a2016952827 on 01/03/18.
 */

public class DebugActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("OnCreate","OnCreate Ativado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume","onResume Ativado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("OnRestart","onRestart Ativado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause","onPause Ativado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop","onStop Ativado");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart","onStart Ativado");
    }
}
