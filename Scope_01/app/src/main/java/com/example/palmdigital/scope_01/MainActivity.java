package com.example.palmdigital.scope_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// we are outside any MainActivity class
// we are outside any methods

// Understanding how scope works is very important


public class MainActivity extends AppCompatActivity
{
   // in the MainActivity class but outside any methods



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //here, we are inside the onCreate() method, inside
        //the MainActivity class

        //when we declare or define a variable, we use the following format
        //datatype variableName;       this is a variable declaration/definition
        //examples
        int Myint; // this is declaring a variable of datatype 'int' and name 'Myint'
        double myDouble; // this is declaring a variable of datatype 'double' and name 'myDouble'
        TextView textView_story; // this is declaring a variable of datatype 'TextView' named 'textViewStory"

        ImageView imageView_ex; // dataType

        // assigning a value in a declared variable
        // after we declare a variable, we can assign a value to it

        Myint = 10; //setting the value of myInt to an integer

        textView_story = (TextView) findViewById(R.id.textView_st);


        imageView_ex = (ImageView) findViewById(R.id.imageView);

        String myString = "";
        myString = "";



    } // end of onCreate method

    public void myAwesomeMethod1()
    {

    }
    public void myAwesomeMethod2()


}// end of class
