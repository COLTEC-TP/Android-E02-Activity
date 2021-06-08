package br.ufmg.coltec.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    EditText txt1;
    EditText txt2;
    TextView txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("DebugActivity", "App inicializado");

        txt1 = findViewById(R.id.user_txt_id);
        txt2 = findViewById(R.id.senha_txt_id);
        txt3 = findViewById(R.id.error_txt_id);

        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((txt1.getText().toString().equals("admin") && txt2.getText().toString().equals("admin123"))) {
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    String textoStr = txt1.getText().toString();
                    Bundle parametros = new Bundle();
                    parametros.putString("texto", textoStr);
                    intent.putExtras(parametros);
                    startActivity(intent);
                } else {
                    Toast t = Toast.makeText(MainActivity.this, txt3.getText(), Toast.LENGTH_LONG);
                    t.setGravity(Gravity.BOTTOM, 0, 120);
                    t.show();
                    Log.w("DebugActivity", "Você clicou no botão");
                }
            }
        });
        Log.i("DebugActivity", "A Activity foi criada corretamente");
    }
}