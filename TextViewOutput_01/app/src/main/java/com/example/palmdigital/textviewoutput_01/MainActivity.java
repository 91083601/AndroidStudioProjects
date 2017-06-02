package com.example.palmdigital.textviewoutput_01;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageView imageView_1;
    ImageView imageView_2;
    ImageView imageView_3;
    ImageView imageView_4;
    ImageView imageView_add;
    ImageView imageView_5;
    ImageView imageView_6;
    ImageView imageView_7;



    TextView textView_top;
    TextView textView_middle;
    TextView textView_bottom;

    int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView_1 = (ImageView) findViewById(R.id.imageView1);
        imageView_2 = (ImageView) findViewById(R.id.imageView2);
        imageView_3 = (ImageView) findViewById(R.id.imageView3);
        imageView_add = (ImageView) findViewById(R.id.imageView_plus);
        imageView_4 = (ImageView) findViewById(R.id.imageView4);
        imageView_5 = (ImageView) findViewById(R.id.imageView5);
        imageView_6 = (ImageView) findViewById(R.id.imageView6);
        imageView_7 = (ImageView) findViewById(R.id.imageView_equals);

        imageView_1.setOnClickListener(this);
        imageView_2.setOnClickListener(this);
        imageView_3.setOnClickListener(this);
        imageView_4.setOnClickListener(this);
        imageView_add.setOnClickListener(this);
        imageView_5.setOnClickListener(this);
        imageView_6.setOnClickListener(this);
        imageView_7.setOnClickListener(this);

        textView_top = (TextView) findViewById(R.id.textView_top);
        textView_middle = (TextView) findViewById(R.id.textView_middle);
        textView_bottom = (TextView) findViewById(R.id.textView_bottom);


    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView1)
        {
            textView_top.setText("1");
            num1 = 1;
        }
        else if(view.getId() == R.id.imageView2)
        {
            textView_top.setText("2");
            num1 = 2;
        }
        else if(view.getId() == R.id.imageView3)
        {
            textView_top.setText("3");
            num1 = 3;
        }
        else if(view.getId() == R.id.imageView4)
        {
            textView_middle.setText("4");
            num2 = 4;
        }
        else if(view.getId() == R.id.imageView5)
        {
            textView_middle.setText("5");
            num2 = 5;
        }
        else if(view.getId() == R.id.imageView6)
        {
            textView_middle.setText("6");
            num2 = 6;
        }
        else if(view.getId() == R.id.imageView_equals)
        {
            int sum = num1 + num2;
            textView_bottom.setText("" + (num1 + num2));
        }
    }
}
