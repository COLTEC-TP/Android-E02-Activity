package br.ufmg.coltec.tp.e02;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaTela extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        Bundle activityBundle = this.getIntent().getExtras();
        String name = activityBundle.getString("name");
        TextView lblMessage = findViewById(R.id.LoginCerto);
        lblMessage.setText("Olá, " + name);
    }
}
