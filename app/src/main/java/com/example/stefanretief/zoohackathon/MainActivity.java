package com.example.stefanretief.zoohackathon;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextWatcher;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText from = (EditText) findViewById(R.id.fromLoc);
        final EditText to = (EditText) findViewById(R.id.toLoc);

        final Button startVoyage = (Button) findViewById(R.id.Voyage);
        startVoyage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (from.getText() != "From" && to.getText() != "To") {
                        Intent goToVoyage = new Intent(MainActivity.this, InitialVoyage.class);
                        goToVoyage.putExtra("fromVal", from.getText());
                        goToVoyage.putExtra("toVal", to.getText());
                        startActivity(goToVoyage);
                    }
                    else {
                        //do something about empty fields
                    }

            }
        });
    }


}
