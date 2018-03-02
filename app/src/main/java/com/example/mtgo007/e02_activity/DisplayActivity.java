package com.example.mtgo007.e02_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView user = findViewById(R.id.user);
        TextView pass = findViewById(R.id.senha);

        Bundle b = this.getIntent().getExtras();

        user.setText(b.get("usuario").toString());
        pass.setText(b.get("senha").toString());
    }
}
