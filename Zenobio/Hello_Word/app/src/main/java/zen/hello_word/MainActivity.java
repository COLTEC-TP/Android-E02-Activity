package zen.hello_word;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity{

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button logIn = (Button) findViewById(R.id.button);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                Bundle args = new Bundle();
                TextView user = (TextView) findViewById(R.id.userText);
                TextView pswd = (TextView) findViewById(R.id.pswdText);
                if(!user.getText().toString().equals((String)"Admin")) {
                    DebugActivity.gerarLogE(TAG, "Usário inválido - " + user.getText().toString());
                    Toast.makeText(MainActivity.this, "Usuário incorreto", Toast.LENGTH_SHORT).show();
                }
                else if(!pswd.getText().toString().equals("Admin123")) {
                    DebugActivity.gerarLogE(TAG, "Senha inválida - " + pswd.getText().toString());
                    Toast.makeText(MainActivity.this, "Senha incorreta", Toast.LENGTH_SHORT).show();
                }
                else {
                    DebugActivity.gerarLogI(TAG, "VALEU!");
                    args.putCharSequence("user", user.getText().toString());
                    args.putCharSequence("pswd", pswd.getText().toString());
                    intent.putExtras(args);
                    startActivity(intent);
                }
            }
        });
    }
}