package br.ufmg.coltec.e02activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.view.Gravity.CENTER;

public class LoginActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText usuario = this.findViewById(R.id.editTextTextPersonName);
        EditText senha = this.findViewById(R.id.editTextTextPassword);
        Button btnLogin = this.findViewById(R.id.button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usuario.getText().toString().equals("admin") && senha.getText().toString().equals("admin123")) {
                    Log.d("DebugActivity", "BtnLogin: Usuário e senha correta");
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    Bundle args = new Bundle();
                    args.putCharSequence("name", usuario.getText().toString());
                    intent.putExtras(args);
                    startActivity(intent);
                }else{
                    Log.d("DebugActivity", "BtnLogin: Usuário ou senha incorreta");
                    Toast toast = Toast.makeText(LoginActivity.this, R.string.toast, Toast.LENGTH_LONG);
                    toast.setGravity(CENTER, 0, 200);
                    toast.show();
                }
            }
        });
    }
}