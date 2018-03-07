package com.example.a2016951715.android_e02_activity;


import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class afterLoginActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        Log.i(afterLoginActivity.class.getName(), "onCreate()");

        Bundle activityBundle = this.getIntent().getExtras();
        String user = activityBundle.getString("usuario");
        String password = activityBundle.getString("senha");
        TextView lblMessage = findViewById(R.id.msg);
        lblMessage.setText("Bem vindo, " + user + "!\nA sua senha é " + password);
    }


}