package com.example.palmdigital.chooseadventure_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HECKYESActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heckyes);

        TextView textView_story    = (TextView) findViewById(R.id.textView_story);

        textView_story.setText("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
}
