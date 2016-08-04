package com.arjun.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
Button add, div, mul, sub, clr;
    EditText t1,t2;
    TextView t3;
    String str_num1,str_num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        t1 = (EditText)findViewById(R.id.editText);
        t2 = (EditText) findViewById(R.id.editText2);

        t3 = (TextView) findViewById(R.id.textView3);

        add = (Button) findViewById(R.id.button);
        div = (Button) findViewById(R.id.button3);
        mul = (Button) findViewById(R.id.button4);
        sub = (Button) findViewById(R.id.button2);
        clr = (Button) findViewById(R.id.button5);





        add.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                str_num1 = t1.getText().toString();
                str_num2 = t2.getText().toString();
               Float flt_add = Float.parseFloat(str_num1)+Float.parseFloat(str_num2);
               t3.setText(flt_add.toString());
            }
        });

        mul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                str_num1 = t1.getText().toString();
                str_num2 = t2.getText().toString();
                Float flt_add = Float.parseFloat(str_num1)*Float.parseFloat(str_num2);
                t3.setText(flt_add.toString());
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                str_num1 = t1.getText().toString();
                str_num2 = t2.getText().toString();
                Float flt_add = Float.parseFloat(str_num1)-Float.parseFloat(str_num2);
                t3.setText(flt_add.toString());
            }
        });

        div.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                str_num1 = t1.getText().toString();
                str_num2 = t2.getText().toString();
                try {
                   Float flt_add = Float.parseFloat(str_num1)/Float.parseFloat(str_num2);
                t3.setText(flt_add.toString());
                }
                catch (Exception e){
                    t3.setText("Cannot Divide!!..");
                }
            }
        });

        clr.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });



    }
}
