package br.ufmg.coltec.tp.e02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;


public class MainActivity extends debugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText email = findViewById(R.id.email);
        final EditText senha = findViewById(R.id.senha);
        Button botaoLogin = findViewById(R.id.botaoLogin);

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("admin") && senha.getText().toString().equals("admin123")) {
                    Toast.makeText(MainActivity.this, "Login efetuado com sucesso!", Toast.LENGTH_SHORT).show();
                    Log.i("tag", "Login efetuado com sucesso!"); //Log.i = informacao
                    Intent intent = new Intent(MainActivity.this, tela2.class);
                    Bundle args = new Bundle();
                    args.putCharSequence("email", email.getText().toString());
                    args.putCharSequence("senha", senha.getText().toString());
                    intent.putExtras(args);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Email ou senha incorreto", Toast.LENGTH_SHORT).show();
                    Log.e("tag", "Email ou senha incorreto"); //Log.e = error
                }
            }
        }
        );
    }
}
