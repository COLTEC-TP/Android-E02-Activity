package com.example.a2016951820.e02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.i(LoginActivity.class.getName(), "onCreate()");

        final EditText user = findViewById(R.id.username);
        final EditText psw = findViewById(R.id.password);
        Button button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("admin") && psw.getText().toString().equals("admin123")){
                    Intent intent = new Intent(LoginActivity.this, SucessoActivity.class);
                    Bundle args = new Bundle();
                    args.putCharSequence("usuario", user.getText().toString());
                    args.putCharSequence("senha", psw.getText().toString());
                    intent.putExtras(args);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this, "Dados incorretos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
