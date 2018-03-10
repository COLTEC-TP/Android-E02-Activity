package deneribeiro10.github.io.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        final String TAG = LoginActivity.class.getSimpleName();

        Button btn_Login = findViewById(R.id.login);
        final EditText username = findViewById(R.id.username);
        final EditText campoUsuario = findViewById(R.id.adm);
        final EditText campoSenha = findViewById(R.id.pass);

        campoSenha.setText("");

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = campoUsuario.getText().toString();
                String senha = campoSenha.getText().toString();
                String user = username.getText().toString();

                if(!camposVazios(TAG, usuario, senha) && autentica(TAG, usuario, senha)) {
                    // login ok
                    Intent goApp = new Intent(LoginActivity.this, AppActivity.class);

                    // bundle
                    Bundle bund = new Bundle();
                    bund.putCharSequence("usuario", username.getText().toString());
                    goApp.putExtras(bund);

                    startActivity(goApp);
                }

            }
        });

    }

    protected boolean autentica(String TAG, String usuario, String senha) {
        final String admin = "admin";
        final String pass = "admin123";
        if(!usuario.equals(admin) || !senha.equals(pass)) {
            Toast.makeText(LoginActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
            Log.e(TAG, "Login failed");
            return false;
        }
        return true;
    }

    protected boolean camposVazios(String TAG, String usuario, String senha) {
        if(usuario.isEmpty() || senha.isEmpty()) {
            Toast.makeText(LoginActivity.this, "Empty Field", Toast.LENGTH_SHORT).show();
            Log.e(TAG, "Empty field");
            return true;
        }
        return false;
    }

}
