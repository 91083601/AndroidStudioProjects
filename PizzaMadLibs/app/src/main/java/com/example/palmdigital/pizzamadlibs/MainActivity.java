package com.example.palmdigital.pizzamadlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeStory(View view)
    {
        TextView textView = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        TextView textView10 = (TextView) findViewById(R.id.textView10);



        EditText adj = (EditText) findViewById(R.id.edit_text_adj01);
        EditText one = (EditText) findViewById(R.id.editText1);
        EditText two = (EditText) findViewById(R.id.editText2);
        EditText three = (EditText) findViewById(R.id.editText3);
        EditText four = (EditText) findViewById(R.id.editText4);
        EditText five = (EditText) findViewById(R.id.editText5);
        EditText six = (EditText) findViewById(R.id.editText6);
        EditText seven = (EditText) findViewById(R.id.editText7);






        String str_adj = adj.getText().toString();
        String str_one = one.getText().toString();
        String str_two = two.getText().toString();
        String str_three = three.getText().toString();
        String str_four = four.getText().toString();
        String str_five = five.getText().toString();
        String str_six = six.getText().toString();
        String str_seven = seven.getText().toString();

        String story = "Pizza was invented by an ";

        story = story + str_adj + " " + str_one + " " + "chef named" + " " + str_two  + "." + " " + "To make a pizza, you need to take a lump of" + " " + str_three + " " + ", and make a thin, round" + " " + str_four + " " + str_five + "." + " " + "Then you cover it with " + str_six + " " + "sauce, " + " " + "and"  + " " + str_seven + " cheese.";

        textView.setText(story);



    }
}
