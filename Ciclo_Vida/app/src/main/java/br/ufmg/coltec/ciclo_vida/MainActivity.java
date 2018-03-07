package br.ufmg.coltec.ciclo_vida;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.view.View.*;


public class MainActivity extends Main2Activity {

    EditText mEditUsername; 
    EditText mEditPassword;
    public static final String KEY_INFO_LOGIN = "KEY_INFO_LOGIN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditUsername = findViewById(R.id.etUsername);
        mEditPassword = findViewById(R.id.etPassword);
        Button bLogin;

        final Button button = findViewById(R.id.bLogin);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Log.e("log", "do cachu");
                if (mEditUsername.getText().toString().equals("admin") && mEditPassword.getText().toString().equals("admin123")) {

                    Toast.makeText(MainActivity.this, "Dados Corretos", Toast.LENGTH_SHORT).show();
                    tela2();
                }

                else {
                    Toast.makeText(MainActivity.this, "Dados Incorretos", Toast.LENGTH_SHORT).show();
                    Log.i("MainActivity", "Login feito Incorretamente.");
                }
            }
        });

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void onDisplay(android.view.View view) {

        String mensage = mEditUsername.getText().toString() + mEditPassword.getText().toString();


        if (TextUtils.isEmpty(mEditUsername.getText().toString()) || TextUtils.isEmpty(mEditPassword.getText().toString())) {
            Toast.makeText(this, "Campo vazio", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(MainActivity.this, mensage, Toast.LENGTH_LONG).show();
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void tela2(){
        Bundle bundleInformacoes = new Bundle();
        String user = mEditUsername.getText().toString();
        bundleInformacoes.putString(KEY_INFO_LOGIN, user);
        Intent intentMudancaTela = new Intent(MainActivity.this, Main2Activity.class);
        intentMudancaTela.putExtras(bundleInformacoes);
        Log.i("", "Login feito Corretamente.");
        startActivity(intentMudancaTela);
    }
}



