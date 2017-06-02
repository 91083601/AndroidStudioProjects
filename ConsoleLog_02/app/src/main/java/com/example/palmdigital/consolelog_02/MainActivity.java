package com.example.palmdigital.consolelog_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
    // fields = class level variables
    private int myInt;
    private double myDouble;
    private String myString;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("Info", "myInt = " + myInt);
        double myDouble = setDoubleValue();
        Log.i("Info", "myDouble = " + myDouble);


    }

    public boolean  setBooleanValue()
    {
        return false;
    }

    public double setDoubleValue()
    {
        return 10.987;
    }
    public int setIntValue()
    {
        return 10;
    }
    public float setFloatValue()
    {
        return (4.5f + 2.3f);
    }
}
