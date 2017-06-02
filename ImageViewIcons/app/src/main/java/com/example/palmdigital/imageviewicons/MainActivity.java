package com.example.palmdigital.imageviewicons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button) findViewById(R.id.button1);
        Button buttonObject2 = (Button) findViewById(R.id.button2);
        Button buttonObject3 = (Button) findViewById(R.id.button3);
        Button buttonObject4 = (Button) findViewById(R.id.button4);
        Button buttonObject5 = (Button) findViewById(R.id.button5);
        Button buttonObject6 = (Button) findViewById(R.id.button6);

        buttonObject1.setText("Contacts");
        buttonObject2.setText("Email");
        buttonObject3.setText("Messages");
        buttonObject4.setText("Contacts");
        buttonObject5.setText("Email");
        buttonObject6.setText("Messages");

        buttonObject1.setOnClickListener(this);
        buttonObject2.setOnClickListener(this);
        buttonObject3.setOnClickListener(this);
        buttonObject4.setOnClickListener(this);
        buttonObject5.setOnClickListener(this);
        buttonObject6.setOnClickListener(this);

        buttonObject1.setBackgroundColor(0xff0000ff);
        buttonObject2.setBackgroundColor(0xffff00ff);
        buttonObject3.setBackgroundColor(0xff00ff00);
        buttonObject4.setBackgroundColor(0xff0000ff);
        buttonObject5.setBackgroundColor(0xffff00ff);
        buttonObject6.setBackgroundColor(0xff00ff00);
    }
}
