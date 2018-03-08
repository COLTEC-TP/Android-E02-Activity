package br.ufmg.coltec.e02activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText user = findViewById(R.id.inputUser);
        final EditText pass = findViewById(R.id.inputPass);
        Button loginButton = findViewById(R.id.inputButton);

        final String userName = new String("admin");
        final String password = new String("admin123");

        loginButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(user.getText().toString().equals(userName) && pass.getText().toString().equals(password)){
                            Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                            //passar o username por parametro
                            Bundle args = new Bundle();
                            args.putCharSequence("name", user.getText().toString());
                            intent.putExtras(args);

                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(MainActivity.this,"Usuário ou senha incorreto",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

    }
}
