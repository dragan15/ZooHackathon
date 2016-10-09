package com.example.stefanretief.zoohackathon;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
public class InitialVoyage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_voyage);

        Intent intent = getIntent();
        EditText fromVoy = (EditText) findViewById(R.id.FromVoyage);
        EditText toVoy = (EditText) findViewById(R.id.ToVoyage);
        fromVoy.setText(intent.getStringExtra("FromVal"));
        toVoy.setText(intent.getStringExtra("ToVal"));

    }

}
