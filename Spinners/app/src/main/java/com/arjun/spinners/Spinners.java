package com.arjun.spinners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Spinners extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinners);
        spin =(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(Spinners.this);

        ArrayList<String> sp = new ArrayList<>();


        sp.add("BBA");
        sp.add("BCA");
        sp.add("BSC");

        ArrayAdapter<String> ad = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,sp);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(ad);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String item = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(),item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
