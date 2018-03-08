package com.example.a2016951707.androide02activity;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText texto1 = findViewById(R.id.TextLogin);
        final EditText password1 = findViewById(R.id.password1);

        Button btntexto1 = findViewById(R.id.button);

        btntexto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (texto1.getText().length() == 0 || password1.getText().length() == 0){

                    Toast.makeText(MainActivity.this,"Por favor, preencha todos os campos", Toast.LENGTH_LONG).show();
                    Log.i("Não logado","Campos em branco");

                }

                else {

                    if (texto1.getText().toString().equals("admin") && password1.getText().toString().equals("admin123")) {

                        Intent intent = new Intent(MainActivity.this, Sucesso.class);


                        Bundle args = new Bundle();
                        args.putCharSequence("name", texto1.getText());
                        args.putCharSequence("password", password1.getText());
                        intent.putExtras(args);

                        Log.i("logado", "Activity inicializado!!");
                        startActivity(intent);
                    }

                    else

                        Toast.makeText(MainActivity.this,"Senha ou usuario invalido", Toast.LENGTH_SHORT).show();
                        Log.i("Não logado","Login feito incorretamente");
                }

            }
        });

    }
}
