package br.ufmg.coltec.tp.e02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Log.d("debugging", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debugging", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debugging", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debugging", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debugging", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debugging", "onStart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debugging", "onDestroy()");
    }

}
