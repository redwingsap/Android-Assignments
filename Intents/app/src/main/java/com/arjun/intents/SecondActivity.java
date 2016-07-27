package com.arjun.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView t1;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1 = (TextView) findViewById(R.id.textView);
        Intent txt = getIntent();
        msg = txt.getStringExtra("msg");
        t1.setText(msg);
    }
}
