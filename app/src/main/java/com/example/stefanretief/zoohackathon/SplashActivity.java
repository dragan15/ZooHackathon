package com.example.stefanretief.zoohackathon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Aurelio Arango on 10/8/2016.
 *
 */

public class SplashActivity  extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
