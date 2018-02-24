package com.julie.languagetranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
       // setContentView(R.layout.list_item);

                      // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
              words.add(new Word("red", "nyekundu", R.drawable.color_red));
            words.add(new Word("mustard yellow", "manjano",R.drawable.color_mustard_yellow));
         words.add(new Word("blue", "samawati",R.drawable.color_dusty_yellow));
            words.add(new Word("green", "kijani",R.drawable.color_green));
           words.add(new Word("brown", "hudhurungi", R.drawable.color_brown));
        words.add(new Word("gray", "grey",R.drawable.color_gray));
          words.add(new Word("black", "nyeusi",R.drawable.color_black));
          words.add(new Word("white", "nyeupe",R.drawable.color_white));

        //the adapter enables the elements in the array list to be to be called into the lis view on demand
        WordAdapter adapter = new WordAdapter(this, words);

        //find the list view
        ListView listView = (ListView) findViewById(R.id.rootView);

        //bind the adapter and the listView
        listView.setAdapter(adapter);
    }
}


