package deneribeiro10.github.io.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AppActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        Bundle received = this.getIntent().getExtras();
        String user = received.getString("usuario");

        TextView msg = findViewById(R.id.welcome);
        msg.setText("Welcome '" + user + "' we know you will have fun using our app. Tanks for downloading. Byee");
    }
}
