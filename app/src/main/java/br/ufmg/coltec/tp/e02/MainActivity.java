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

    private final static String LOG_TAG = MainActivity.class.getSimpleName();

    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsernameEditText = (EditText) findViewById(R.id.username_editText);
        mPasswordEditText = (EditText) findViewById(R.id.password_editText);
        mLoginButton = (Button) findViewById(R.id.submit_button);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = mUsernameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();

                if (login.equals("admin") && password.equals("admin123")) {
                    Intent intent = new Intent(MainActivity.this,
                            WelcomeActivity.class);

                    Bundle args = new Bundle();
                    args.putCharSequence("username", login);

                    intent.putExtras(args);
                    startActivity(intent);

                    Log.i(LOG_TAG, "Login sucedido");
                } else {
                    Toast.makeText(MainActivity.this,
                            "Senha ou email incorreto.",
                            Toast.LENGTH_SHORT)
                            .show();
                    Log.i(LOG_TAG, "Senha ou email incorreto");
                }
            }
        });
    }
}
