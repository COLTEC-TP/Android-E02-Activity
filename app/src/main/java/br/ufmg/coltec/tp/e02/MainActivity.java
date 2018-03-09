package br.ufmg.coltec.tp.e02;

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

        final EditText user = findViewById(R.id.user);
        final EditText senha = findViewById(R.id.passwd);
        Button login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("admin") && senha.getText().toString().equals("admin123")) {
                    Log.i("Login Realizado!","Passando para a próxima Activity");
                    Intent intent = new Intent(MainActivity.this, AfterLoginActivity.class);

                    Bundle args = new Bundle();
                    args.putCharSequence("user",user.getText().toString());

                    intent.putExtras(args);
                    startActivity(intent);
                }

                else {
                    Log.e("Login não realizado!", "Dados incorretos");
                    Toast.makeText(MainActivity.this,"Dados incorretos!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
