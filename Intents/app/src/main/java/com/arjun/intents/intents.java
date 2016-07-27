package com.arjun.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intents extends AppCompatActivity {
Button b1;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                Intent i = new Intent(intents.this,SecondActivity.class);
                i.putExtra("msg","This is your second Activity");
                startActivity(i);
            }
        });
    }
}
