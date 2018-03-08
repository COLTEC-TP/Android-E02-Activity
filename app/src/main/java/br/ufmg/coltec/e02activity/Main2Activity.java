package br.ufmg.coltec.e02activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle activityBundle = this.getIntent().getExtras();
        String name = activityBundle.getString("name");

        TextView username = findViewById(R.id.userText);

        username.setText("Bem vindo, " + name + "!");
    }
}
