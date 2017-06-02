package com.example.palmdigital.firstbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener;
{

@Override
protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1=(Button)findViewById(R.id.buttonMyButton1);
        buttonObject1.setText("Button 1");

        buttonObject1.setOnClickListener(this);
        }

public void onClick(View view)
        {
        Log.i("info","Hey, you pressed Button1!!!!")
        Toast.makeText(MainActivity.this, "You pressed Button 1!", Toast.LENGTH_SHORT.show();
        }
        }