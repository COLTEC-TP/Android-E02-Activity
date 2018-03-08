package br.ufmg.coltec.tp.e02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends DebugActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nome = (EditText) findViewById(R.id.name);
        final EditText senha = (EditText) findViewById(R.id.pass);
        final Button submit = (Button) findViewById(R.id.submit);
        final String comp = "admin";
        final String comp1 = "admin123";
        super.classname = MainActivity.class.getName();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String testen = nome.getText().toString();
                String testes = senha.getText().toString();
                if (testen.equals(comp) && testes.equals(comp1)){
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(MainActivity.this, "Password Incorrect", Toast.LENGTH_LONG ).show();
            }
        });
    }

}
