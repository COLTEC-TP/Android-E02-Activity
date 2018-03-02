package zen.hello_word;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Bundle activityBundle = this.getIntent().getExtras();
        String name = activityBundle.getString("user");
        String pswd = activityBundle.getString("pswd");
        TextView userText = findViewById(R.id.viewUser);
        TextView pswdText = findViewById(R.id.viewPswd);
        userText.setText("Hello," + name);
    }
}
