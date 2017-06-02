package com.example.palmdigital.textviewoutput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.palmdigital.textviewoutput.R.id.imageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //fields
    TextView textViewDisplayTop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView imageViewNum1 = (ImageView) findViewById(imageView);
        imageView imageViewNum2 = (ImageView) findViewById(R.id.imageView2);
        imageView imageViewNum3 = (ImageView) findViewById(R.id.imageView3);

        textViewDisplayTop = (TextView) findViewById(R.id.textView);

        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);


    }

    public void onClick(View view)
    {
        int testing = 5;
        if(view.getId() == imageView)
        {
            Toast.makeText(MainActivity.this, "You clicked 1", Toast.LENGTH_SHORT.show());
        }
    }
}
