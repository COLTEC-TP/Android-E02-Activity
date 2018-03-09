package br.ufmg.coltec.tp.e02;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AfterLoginActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        Bundle args = this.getIntent().getExtras();
        String user = args.getString("user");

        TextView username = findViewById(R.id.username);
        username.setText("Nome de usuário: " + user);
    }
}
