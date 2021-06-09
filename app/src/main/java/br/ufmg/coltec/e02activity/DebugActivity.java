package br.ufmg.coltec.e02activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("DebugActivity", "onCreate()");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d("DebugActivity", "onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("DebugActivity", "onResume()");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d("DebugActivity", "onRestart()");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.d("DebugActivity", "onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("DebugActivity", "onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("DebugActivity", "onDestroy()");
        super.onDestroy();
    }
}