package br.ufmg.coltec.tp.e02;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Activity","OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity","OnPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity","OnRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity","OnDestroy");
    }
}
