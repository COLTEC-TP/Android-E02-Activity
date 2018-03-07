package br.ufmg.coltec.exe12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = findViewById(R.id.btn_login);
        final EditText login = findViewById(R.id.lbl_text);
        final EditText senha = findViewById(R.id.password);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (login.getText().toString().equals("admin") && senha.getText().toString().equals("admin123")) {
                    Intent intent = new Intent(MainActivity.this, SegundaTela.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Dados Incorretos", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
