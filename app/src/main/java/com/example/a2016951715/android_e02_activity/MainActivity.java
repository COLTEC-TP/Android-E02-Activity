package com.example.a2016951715.android_e02_activity;

import android.content.Intent;
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
        Log.i(MainActivity.class.getName(), "onCreate()");

        final EditText usuario = findViewById(R.id.username);
        final EditText senha = findViewById(R.id.password);
        Button button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( senha.getText().toString().equals("admin123") && usuario.getText().toString().equals("admin") ){
                    Bundle args = new Bundle();
                    args.putCharSequence("usuario", usuario.getText().toString());
                    args.putCharSequence("senha", senha.getText().toString());
                    Intent intent = new Intent(MainActivity.this, afterLoginActivity.class);
                    intent.putExtras(args);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Login ou senha errados", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
