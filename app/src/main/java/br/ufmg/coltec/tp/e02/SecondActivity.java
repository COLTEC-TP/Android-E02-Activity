package br.ufmg.coltec.tp.e02;

import android.os.Bundle;

public class SecondActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        super.classname = SecondActivity.class.getName();
    }
}
