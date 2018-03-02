package com.example.mtgo007.e02_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText user = findViewById(R.id.usuario);
        final EditText senha = findViewById(R.id.senha);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = user.getText().toString();
                String pass = senha.getText().toString();

                if(usuario.equals("")||pass.equals("")){
                    Log.e("Campos Nulos","Campos Nulos");
                    Toast.makeText(MainActivity.this, "Campos Nulos :(", Toast.LENGTH_LONG).show();
                } else{
                    if(usuario.equals("admin")&&pass.equals("admin123")){
                        //senha correta, logado com sucesso
                        Log.i("Logado Com Sucesso","Logado Com Sucesso");
                        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                        Bundle b = new Bundle();
                        b.putCharSequence("usuario", usuario);
                        b.putCharSequence("senha", pass);
                        intent.putExtras(b);
                        startActivity(intent);
                    } else{
                        Log.e("login error","usuario ou senha invalidos");
                        Toast.makeText(MainActivity.this, "Usuario ou Senha Invalidos :(", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
