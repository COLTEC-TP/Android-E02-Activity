package br.ufmg.coltec.tp.e02;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Germano Barcelos on 01/03/2018.
 */

public class DebugActivity extends AppCompatActivity {
    private final static String LOG_TAG = DebugActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, getClassName() + " Método onCreate() foi chamado.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_TAG, getClassName() + " Método onStart() foi chamado.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, getClassName() + " Método onStop() foi chamado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG, getClassName() + " Método onDestroy() foi chamado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, getClassName() + " Método onRestart() foi chamado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, getClassName() + " Método onPause() foi chamado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, getClassName() + " Método onResume() foi chamado.");
    }

    @NonNull
    private String getClassName() {
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }
}
