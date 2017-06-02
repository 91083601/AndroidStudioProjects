package com.example.palmdigital.simplecalc_03;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageView imageView_0;
    ImageView imageView_1;
    ImageView imageView_2;
    ImageView imageView_3;
    ImageView imageView_4;
    ImageView imageView_5;
    ImageView imageView_6;
    ImageView imageView_7;
    ImageView imageView_8;
    ImageView imageView_9;
    ImageView imageViewSet_2_0;
    ImageView imageViewSet_2_1;
    ImageView imageViewSet_2_2;
    ImageView imageViewSet_2_3;
    ImageView imageViewSet_2_4;
    ImageView imageViewSet_2_5;
    ImageView imageViewSet_2_6;
    ImageView imageViewSet_2_7;
    ImageView imageViewSet_2_8;
    ImageView imageViewSet_2_9;
    ImageView imageView_equals_1;
    ImageView imageView_plus_1;
    ImageView imageView_minus_1;
    ImageView imageView_times_1;
    ImageView imageView_divide_1;

    TextView textView_top;
    TextView textView_middle;
    TextView textView_bottom;

    int operator;

    int num1;
    int num2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView_0 = (ImageView) findViewById(R.id.imageView0);
        imageView_1 = (ImageView) findViewById(R.id.imageView1);
        imageView_2 = (ImageView) findViewById(R.id.imageView2);
        imageView_3 = (ImageView) findViewById(R.id.imageView3);
        imageView_4 = (ImageView) findViewById(R.id.imageView4);
        imageView_5 = (ImageView) findViewById(R.id.imageView5);
        imageView_6 = (ImageView) findViewById(R.id.imageView6);
        imageView_7 = (ImageView) findViewById(R.id.imageView7);
        imageView_8 = (ImageView) findViewById(R.id.imageView8);
        imageView_9 = (ImageView) findViewById(R.id.imageView9);
        imageViewSet_2_0 = (ImageView) findViewById(R.id.imageViewSet2_0);
        imageViewSet_2_1 = (ImageView) findViewById(R.id.imageViewSet2_1);
        imageViewSet_2_2 = (ImageView) findViewById(R.id.imageViewSet2_2);
        imageViewSet_2_3 = (ImageView) findViewById(R.id.imageViewSet2_3);
        imageViewSet_2_4 = (ImageView) findViewById(R.id.imageViewSet2_4);
        imageViewSet_2_5 = (ImageView) findViewById(R.id.imageViewSet2_5);
        imageViewSet_2_6 = (ImageView) findViewById(R.id.imageViewSet2_6);
        imageViewSet_2_7 = (ImageView) findViewById(R.id.imageViewSet2_7);
        imageViewSet_2_8 = (ImageView) findViewById(R.id.imageViewSet2_8);
        imageViewSet_2_9 = (ImageView) findViewById(R.id.imageViewSet2_9);

        imageView_equals_1 = (ImageView) findViewById(R.id.imageView_equals);
        imageView_plus_1 = (ImageView) findViewById(R.id.imageView_plus);
        imageView_minus_1 = (ImageView) findViewById(R.id.imageView_minus);
        imageView_times_1 = (ImageView) findViewById(R.id.imageView_times);
        imageView_divide_1 = (ImageView) findViewById(R.id.imageView_divide);

        imageView_0.setOnClickListener(this);
        imageView_1.setOnClickListener(this);
        imageView_2.setOnClickListener(this);
        imageView_3.setOnClickListener(this);
        imageView_4.setOnClickListener(this);
        imageView_5.setOnClickListener(this);
        imageView_6.setOnClickListener(this);
        imageView_7.setOnClickListener(this);
        imageView_8.setOnClickListener(this);
        imageView_9.setOnClickListener(this);
        imageViewSet_2_0.setOnClickListener(this);
        imageViewSet_2_1.setOnClickListener(this);
        imageViewSet_2_2.setOnClickListener(this);
        imageViewSet_2_3.setOnClickListener(this);
        imageViewSet_2_4.setOnClickListener(this);
        imageViewSet_2_5.setOnClickListener(this);
        imageViewSet_2_6.setOnClickListener(this);
        imageViewSet_2_7.setOnClickListener(this);
        imageViewSet_2_8.setOnClickListener(this);
        imageViewSet_2_9.setOnClickListener(this);


        imageView_plus_1.setOnClickListener(this);
        imageView_minus_1.setOnClickListener(this);
        imageView_times_1.setOnClickListener(this);
        imageView_divide_1.setOnClickListener(this);
        imageView_equals_1.setOnClickListener(this);



        textView_top = (TextView) findViewById(R.id.textView_top);
        textView_middle = (TextView) findViewById(R.id.textView_middle);
        textView_bottom = (TextView) findViewById(R.id.textView_bottom);

    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView0)
        {
            textView_top.setText("0");
            num1 = 0;
        }
        else if(view.getId() == R.id.imageView1)
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
            textView_top.setText("4");
            num1 = 4;
        }
        else if(view.getId() == R.id.imageView5)
        {
            textView_top.setText("5");
            num1 = 5;
        }
        else if(view.getId() == R.id.imageView6)
        {
            textView_top.setText("6");
            num1 = 6;
        }
        else if(view.getId() == R.id.imageView7)
        {
            textView_top.setText("7");
            num1 = 7;
        }
        else if(view.getId() == R.id.imageView8)
        {
            textView_top.setText("8");
            num1 = 8;
        }
        else if(view.getId() == R.id.imageView9)
        {
            textView_top.setText("9");
            num1 = 9;
        }
        else if(view.getId() == R.id.imageViewSet2_0)
        {
            textView_middle.setText("0");
            num2 = 0;
        }
        else if(view.getId() == R.id.imageViewSet2_1)
        {
            textView_middle.setText("1");
            num2 = 1;
        }
        else if(view.getId() == R.id.imageViewSet2_2)
        {
            textView_middle.setText("2");
            num2 = 2;
        }
        else if(view.getId() == R.id.imageViewSet2_3)
        {
            textView_middle.setText("3");
            num2 = 3;
        }
        else if(view.getId() == R.id.imageViewSet2_4)
        {
            textView_middle.setText("4");
            num2 = 4;
        }
        else if(view.getId() == R.id.imageViewSet2_5)
        {
            textView_middle.setText("5");
            num2 = 5;
        }
        else if(view.getId() == R.id.imageViewSet2_6)
        {
            textView_middle.setText("6");
            num2 = 6;
        }
        else if(view.getId() == R.id.imageViewSet2_7)
        {
            textView_middle.setText("7");
            num2 = 7;
        }
        else if(view.getId() == R.id.imageViewSet2_8)
        {
            textView_middle.setText("8");
            num2 = 8;
        }
        else if(view.getId() == R.id.imageViewSet2_9)
        {
            textView_middle.setText("9");
            num2 = 9;
        }
        else if(view.getId() == R.id.imageView_plus)
        {
            operator = 0;
            switchBackground(0);
        }
        else if(view.getId() == R.id.imageView_minus)
        {
            operator = 1;
            switchBackground(1);
        }
        else if(view.getId() == R.id.imageView_times)
        {
            operator = 2;
            switchBackground(2);
        }
        else if(view.getId() == R.id.imageView_divide)
        {
            operator = 3;
            switchBackground(3);
        }
        else if(view.getId() == R.id.imageView_equals)
        {
            if(operator == 0)
            {
                result = num1 + num2;
            }
            else if(operator == 1)
            {
                result = num1 - num2;
            }
            else if(operator == 2)
            {
                result = num1 * num2;
            }
            else if(operator == 3);
            {
                result = num1 / num2;
            }
            textView_bottom.setText("" + result);
        }
    }
    public void switchBackground(int op)
    {
        if(op == 0)
        {
            imageView_plus_1.setBackgroundColor(0xff0f00ff);
            imageView_minus_1.setBackgroundColor(0xffffffff);
            imageView_divide_1.setBackgroundColor(0xffffffff);
            imageView_times_1.setBackgroundColor(0xffffffff);
        }
        else if(op == 1)
        {
            imageView_plus_1.setBackgroundColor(0xffffffff);
            imageView_minus_1.setBackgroundColor(0xff0f00ff);
            imageView_divide_1.setBackgroundColor(0xffffffff);
            imageView_times_1.setBackgroundColor(0xffffffff);
        }
        else if(op == 2)
        {
            imageView_plus_1.setBackgroundColor(0xffffffff);
            imageView_minus_1.setBackgroundColor(0xffffffff);
            imageView_divide_1.setBackgroundColor(0xffffffff);
            imageView_times_1.setBackgroundColor(0xff0f00ff);
        }
        else if(op == 3)
        {
            imageView_plus_1.setBackgroundColor(0xffffffff);
            imageView_minus_1.setBackgroundColor(0xffffffff);
            imageView_divide_1.setBackgroundColor(0xff0f00ff);
            imageView_times_1.setBackgroundColor(0xffffffff);
        }

    }

}

