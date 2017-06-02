package com.example.palmdigital.intentsputextra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv_story = (TextView) findViewById(R.id.textView_2);

        if(savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }
            else
            {
                newString = extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }

        tv_story.setText(newString);

    }
}
