package br.ufmg.coltec.tp.e02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {

    protected String classname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
        Log.i(classname, "OnCreate Ativado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(classname, "OnPause Ativado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(classname, "OnResume Ativado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(classname, "OnRestart Ativado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(classname, "OnStop Ativado");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(classname, "OnStart Ativado");
    }

}
