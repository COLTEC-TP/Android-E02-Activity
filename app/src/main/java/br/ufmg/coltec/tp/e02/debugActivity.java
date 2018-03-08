package br.ufmg.coltec.tp.e02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class debugActivity extends AppCompatActivity {

    private static final String tag = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
        Toast.makeText(debugActivity.this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.i(tag,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(debugActivity.this, "onStart", Toast.LENGTH_SHORT).show();
        Log.i("tag", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(debugActivity.this, "onResume", Toast.LENGTH_SHORT).show();
        Log.i("tag", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(debugActivity.this, "onPause", Toast.LENGTH_SHORT).show();
        Log.i("tag", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(debugActivity.this, "onStop()", Toast.LENGTH_SHORT).show();
        Log.i("tag", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(debugActivity.this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.i("tag", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(debugActivity.this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("tag", "onDestroy");
    }

}