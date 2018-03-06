package comd.example.a2016951618.ex2;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.i(Main2Activity.class.getName(), "onCreate");

        Bundle activityBundle = this.getIntent().getExtras();
        String nomedeusuario = activityBundle.getString("nomedeusuario");

        TextView lblMessage = findViewById(R.id.lblmessage);
        lblMessage.setText("Usuário: " + nomedeusuario);

    }
}
