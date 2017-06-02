package com.example.palmdigital.consolelog_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int myInt = 5;
        double myDouble = 5.4;
        float myFloat = 4.4f;
        
        system.out.println(4);
        system.out.println(myDouble);




        else
        {
            Log.i("info", "the text is false");
        }

        // functions
        myint = changeValue();

        Log.i("info", "myint has changed to " + myint);


    }

    public int changeValue()
    {
        return 400;
    }
}
