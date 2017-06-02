package com.example.palmdigital.buttonclicks_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      //  Button button = (Button) findViewById(R.id.button);
    }

    public void getName(View view)
    {
        Toast.makeText(this, "This button works", Toast.LENGTH_LONG).show();
    }
    public void  testMethod(View dog)
    {
        Toast.makeText(this, "Toasting second button", Toast.LENGTH_LONG).show();
    }
    public void  testMethod2(View lolipop)
    {
        Toast.makeText(this, "Toasting third button", Toast.LENGTH_LONG).show();
    }
}
