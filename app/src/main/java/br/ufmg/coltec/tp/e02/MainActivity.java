package br.ufmg.coltec.tp.e02;

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

        final EditText Login = findViewById(R.id.Login);
        final EditText Senha = findViewById(R.id.Senha);
        Button Confirma = findViewById(R.id.Botao);

        Confirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Login.getText().toString().equals("admin") && Senha.getText().toString().equals("admin123")){
                    Intent intent = new Intent(MainActivity.this, SegundaTela.class);
                    Bundle args = new Bundle();
                    args.putCharSequence("name", Login.getText().toString());
                    intent.putExtras(args);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Dados incorretos", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}
