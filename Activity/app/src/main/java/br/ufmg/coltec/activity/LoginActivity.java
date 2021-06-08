package br.ufmg.coltec.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends DebugActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt = findViewById(R.id.login_txt);
    }
}