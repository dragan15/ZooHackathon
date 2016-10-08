package com.example.stefanretief.zoohackathon;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button startVoyage = (Button) findViewById(R.id.Voyage);
        startVoyage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }


}
