package com.example.a2016951820.e02;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SucessoActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso);
        Log.i(SucessoActivity.class.getName(), "onCreate()");

        Bundle activityBundle = this.getIntent().getExtras();
        String user = activityBundle.getString("usuario");
        String password = activityBundle.getString("senha");
        TextView lblMessage = findViewById(R.id.msg);
        lblMessage.setText("Bem vindo, " + user + "!\nSua senha é " + password);
    }


}
