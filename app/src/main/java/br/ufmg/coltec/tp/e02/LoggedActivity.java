package br.ufmg.coltec.tp.e02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class LoggedActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);

        TextView txt_userLog = findViewById(R.id.txt_userlog);
        //Bundle bundle = getIntent().getExtras();
        //String userName = bundle.getString("userName");
        String userName = getIntent().getExtras().getString("userName");
        txt_userLog.setText(userName);

        Log.d("debugging","log realizado com sucesso");
    }
}