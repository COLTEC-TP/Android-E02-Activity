package br.ufmg.coltec.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Bundle parametros = this.getIntent().getExtras();
        String textoStr = parametros.getString("texto");

        TextView txtLogin = this.findViewById(R.id.login_txt);
        txtLogin.setText(textoStr);
    }
}