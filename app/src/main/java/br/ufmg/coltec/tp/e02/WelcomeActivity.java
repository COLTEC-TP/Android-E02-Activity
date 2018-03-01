package br.ufmg.coltec.tp.e02;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Bundle activityBundle = this.getIntent().getExtras();

        if (activityBundle != null) {
            String username = activityBundle.getString("username");
            TextView mWelcomeText = findViewById(R.id.welcome_textView);
            mWelcomeText.setText("Olá, " + username);
        }
    }
}
