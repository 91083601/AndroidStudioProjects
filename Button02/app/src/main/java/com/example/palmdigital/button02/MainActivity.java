package com.example.palmdigital.button02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button)findViewById(R.id.buttonMyButton1);
        buttonObject1.setOnClickListener(this); // this class is not
    } // end of oncreate method
    public void onClick(View view)
    {
        Log.i("info", "Hey, you pressed Button 1!!");

        Toast.makeText(MainActivity.this, "You pressed button 1!", Toast.LENGTH_SHORT).show();
    }
}// end of mainactivity class
