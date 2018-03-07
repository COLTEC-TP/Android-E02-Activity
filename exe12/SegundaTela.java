package br.ufmg.coltec.exe12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaTela extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        // recupera dado do bundle
        Bundle activityBundle = this.getIntent().getExtras();
        String name = activityBundle.getString("login");

        // imprime dado na tela
        TextView lblMessage = findViewById(R.id.lbl_recover);
        lblMessage.setText("Login: " + name);

    }
}
