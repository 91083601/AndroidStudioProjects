package com.example.palmdigital.chooseyourownadventure02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.buttonLastName);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        TextView result = (TextView) findViewById(R.id.text_view_result);
        EditText first = (EditText) findViewById(R.id.editText);
        String fName = first.getText().toString(); // error!!!

        result.setText(fName);

        TextView result1 = (TextView) findViewById(R.id.text_view_result);
        EditText last = (EditText) findViewById(R.id.editText);
        String lName = last.getText().toString(); // error!!!

        result.setText(lName);
    }
}