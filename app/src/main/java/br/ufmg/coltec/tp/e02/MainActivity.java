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

    EditText editUser;
    EditText editPass;
    //Button btn_submit;

    final String user = "admin";
    final String pass = "admin123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUser = findViewById(R.id.edit_user);
        editPass = findViewById(R.id.edit_pass);
        //btn_submit = findViewById(R.id.btn_submit);


        /*btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.equals(editUser.getText().toString()) && pass.equals(editPass.getText().toString())){

                    Intent intent = new Intent (MainActivity.this, LoggedActivity.class);
                    intent.putExtra("userName", editUser.getText().toString());
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this,"Login ou senha não cadastrados.", Toast.LENGTH_LONG).show();
                    Log.d("debugging","log não realizado: Login ou senha não conferem");
                }
            }
        });*/
    }

    public void submit (View view){
        if(user.equals(editUser.getText().toString()) && pass.equals(editPass.getText().toString())){

            Intent intent = new Intent (MainActivity.this, LoggedActivity.class);
            intent.putExtra("userName", editUser.getText().toString());
            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this,"Login ou senha não cadastrados.", Toast.LENGTH_LONG).show();
            Log.d("debugging","log não realizado: Login ou senha não conferem");
        }
    }
}
