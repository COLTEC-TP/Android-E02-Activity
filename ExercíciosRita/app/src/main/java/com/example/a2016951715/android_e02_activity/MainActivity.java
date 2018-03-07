package com.example.a2016951715.android_e02_activity;

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
        Log.i(MainActivity.class.getName(), "onCreate()");

        final EditText user = findViewById(R.id.username);
        final EditText psw = findViewById(R.id.password);
        Button button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("admin") && psw.getText().toString().equals("admin123")){
                    Intent intent = new Intent(MainActivity.this, afterLogin.class);
                    Bundle args = new Bundle();
                    args.putCharSequence("usuario", user.getText().toString());
                    args.putCharSequence("senha", psw.getText().toString());
                    intent.putExtras(args);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Dados incorretos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
