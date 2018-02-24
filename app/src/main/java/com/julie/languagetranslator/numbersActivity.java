package com.julie.languagetranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //creating an arraylist named words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "moja",R.drawable.number_one));
        words.add(new Word("two", "mbili",R.drawable.number_two));
        words.add(new Word("three", "tatu",R.drawable.number_three));
        words.add(new Word("four", "nne",R.drawable.number_four));
        words.add(new Word("five", "tano",R.drawable.number_five));
        words.add(new Word("six", "sita",R.drawable.number_six));
        words.add(new Word("seven", "saba",R.drawable.number_seven));
        words.add(new Word("eight", "nane",R.drawable.number_eight));
        words.add(new Word("nine", "tisa",R.drawable.number_nine));
        words.add(new Word("ten", "kumi",R.drawable.number_ten));


        //the adapter enables the elements in the array list to be to be called into the lis view on demand
        WordAdapter adapter = new WordAdapter(this, words);

        //find the list view
        ListView listView = (ListView) findViewById(R.id.rootView);

        //bind the adapter and the listView
        listView.setAdapter(adapter);
    }
}
