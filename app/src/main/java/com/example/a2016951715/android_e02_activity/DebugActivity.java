package com.example.a2016951715.android_e02_activity;

/**
 * Created by a2016951715 on 07/03/18.
 */
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;

public class DebugActivity extends Activity {

    private static final String TAG = DebugActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
    }

}

