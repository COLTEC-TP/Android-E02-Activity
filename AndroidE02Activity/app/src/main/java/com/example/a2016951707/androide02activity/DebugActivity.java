package com.example.a2016951707.androide02activity;

import android.os.Binder;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Log;

/**
 * Created by a2016951707 on 08/03/18.
 */

public class DebugActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("OnCreate","OnCreate acesso");
    }

    protected void onStart(){
        super.onStart();
        Log.i("onStart","onStar acesso");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i("onRestart","onRestar acesso");
    }

    protected void onResume(){
        super.onResume();
        Log.i("onResume","onResume acesso");
    }

    protected void onPause(){
        super.onPause();
        Log.i("onPause","onPause acesso");
    }

    protected void onStop(){
        super.onStop();
        Log.i("onStop","onStop acesso");
    }


}
