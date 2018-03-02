package zen.hello_word;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {

    public static void gerarLogE(String TAG, String message){
        Log.e(TAG, message);
    }
    public static void gerarLogI(String TAG, String message){
        Log.i(TAG, message);
    }
}
