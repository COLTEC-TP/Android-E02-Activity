package br.ufmg.coltec.tp.e02;

import android.os.Bundle;
import android.widget.TextView;

public class tela2 extends debugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        // recuperar dados bundle
        Bundle activityBundle = this.getIntent().getExtras();
        String email = activityBundle.getString("email");
        String senha = activityBundle.getString("senha");

        // Mostrar dados
        TextView lblMessage = findViewById(R.id.mostrarEmail);
        lblMessage.setText("Email:" + email);
        TextView lblMessage2 = findViewById(R.id.mostrarSenha);
        lblMessage2.setText("Email:" + senha);
    }
}
