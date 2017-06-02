package com.example.palmdigital.button03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button) findViewById(R.id.buttonMyButton01);
        Button buttonObject02 = (Button) findViewById(R.id.buttonMyButton02);

        buttonObject01.setText("The Blue Pill");
        buttonObject02.setText("The Red Pill");

        buttonObject01.setBackgroundColor(0xff00ffff);
        buttonObject02.setBackgroundColor(0xffff0000);



        buttonObject01.setOnClickListener(this);
        buttonObject02.setOnClickListener(this);
    }

    public void onClick(View view)
    {
      if(view.getId() == R.id.buttonMyButton01;
        {
            Log.i("info", "You took the Blue pill");
            Toast.makeText(this, "You took the Blue Pill", Toast.LENGTH_SHORT.show();
        }

        else
        {
            Log.i("info", "You took the Red pill");
            Toast.makeText(this, "You took the Red Pill", Toast.LENGTH_SHORT.show();
        }

    }


}
