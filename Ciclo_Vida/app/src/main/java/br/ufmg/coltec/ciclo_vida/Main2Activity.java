package br.ufmg.coltec.ciclo_vida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intentPassada = getIntent();
        Bundle bundle = intentPassada.getExtras();
        if (bundle != null) {
            String user = bundle.getString(MainActivity.KEY_INFO_LOGIN);

            TextView lblMessage = findViewById(R.id.nome);
            lblMessage.setText("Olá, " + user + "\nlogin efetuado com sucesso !");

        }
    }
}
