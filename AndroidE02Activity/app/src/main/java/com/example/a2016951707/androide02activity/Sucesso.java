package com.example.a2016951707.androide02activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sucesso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso);

        Bundle activityBundle = this.getIntent().getExtras();
        String name = activityBundle.getCharSequence("name").toString();
        String password = activityBundle.getCharSequence("password").toString();

        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Login:" + name + " Senha:" + password);
    }
}
