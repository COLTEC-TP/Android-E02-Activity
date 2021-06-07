package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {
    private static final String CLASS_NAME = DebugActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(CLASS_NAME, "DebugActivity.onCreate(): " + getClass().getSimpleName());
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d(CLASS_NAME, "DebugActivity.onStart(): " + getClass().getSimpleName());
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(CLASS_NAME, "DebugActivity.onResume(): " + getClass().getSimpleName());
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(CLASS_NAME, "DebugActivity.onPause(): " + getClass().getSimpleName());
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(CLASS_NAME, "DebugActivity.onStop(): " + getClass().getSimpleName());
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(CLASS_NAME, "DebugActivity.onDestroy(): " + getClass().getSimpleName());
        super.onDestroy();
    }
}