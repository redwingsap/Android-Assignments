package com.arjun.alert_types;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertTypes extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_types);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(AlertTypes.this).create();
                alertDialog.setTitle("Single Button Alert");
                alertDialog.setMessage("This is a Single Button Alert");
                alertDialog.setIcon(R.drawable.icon);
                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"clicked OK button",Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(AlertTypes.this).create();
                alertDialog.setTitle("Double Button Alert");
                alertDialog.setMessage("This is a Double Button Alert");
                alertDialog.setIcon(R.drawable.icon);
                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "YES", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"clicked Positive button",Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "NO", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"clicked Negative button",Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(AlertTypes.this).create();
                alertDialog.setTitle("Three Button Alert");
                alertDialog.setMessage("This is a Three Button Alert");
                alertDialog.setIcon(R.drawable.icon);
                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "YES", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"clicked Positive button",Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "NO", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"clicked Negative button",Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.setButton(DialogInterface.BUTTON_NEUTRAL, "CANCEL", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"clicked Neutral button",Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.show();
            }
        });
    }
    }
