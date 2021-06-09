package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.view.Gravity.TOP;

public class LoginActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText login = this.findViewById(R.id.et_login);
        EditText password = this.findViewById(R.id.et_password);
        Button btnLogin = this.findViewById(R.id.btn_send);

        btnLogin.setOnClickListener(view -> {
            if(login.getText().toString().equals("admin") && password.getText().toString().equals("admin123")) {
                createLog("btnLogin", "Login realizado corretamente");
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                Bundle args = new Bundle();
                args.putCharSequence("name", login.getText().toString());
                intent.putExtras(args);
                startActivity(intent);
            }else{
                createLog("btnLogin", "Usuário ou senha incorretos");
                Toast toast = Toast.makeText(LoginActivity.this, R.string.toast, Toast.LENGTH_LONG);
                toast.setGravity(TOP, 0, 200);
                toast.show();
            }
        });
    }
}