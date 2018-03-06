package comd.example.a2016951618.ex2;

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

        Log.i(MainActivity.class.getName(), "onCreate");

        Button btnlogin = findViewById(R.id.btnlogin);
        final EditText txtusuario = findViewById(R.id.txtusuario);
        final EditText txtsenha = findViewById(R.id.txtsenha);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((txtusuario.getText().toString().equals("admin")) && (txtsenha.getText().toString().equals("admin123"))) {

                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                    Bundle args = new Bundle();
                    args.putCharSequence("nomedeusuario", txtusuario.getText().toString());
                    intent.putExtras(args);

                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Dados Incorretos", Toast.LENGTH_SHORT).show(); //main activity?
                }
            }
        });
    }
}