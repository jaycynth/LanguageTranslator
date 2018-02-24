package com.julie.languagetranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class familyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "papa",R.drawable.family_father));
        words.add(new Word("mother", "mama",R.drawable.family_mother));
        words.add(new Word("son", "mvulana",R.drawable.family_son));
        words.add(new Word("daughter", "msichana",R.drawable.family_daughter));
        words.add(new Word("older brother", "ndugu mkubwa",R.drawable.family_older_brother));
        words.add(new Word("younger brother", "ndugu mdogo",R.drawable.family_younger_brother));
        words.add(new Word("older sister", "dada mkubwa",R.drawable.family_older_sister));
        words.add(new Word("younger sister", "dada mdogo",R.drawable.family_younger_sister));
        words.add(new Word("grandmother ", "nyanya",R.drawable.family_grandmother));
        words.add(new Word("grandfather", "babu",R.drawable.family_grandfather));

        //the adapter enables the elements in the array list to be to be called into the lis view on demand
        WordAdapter adapter = new WordAdapter(this, words);

        //find the list view
        ListView listView = (ListView) findViewById(R.id.rootView);

        //bind the adapter and the listView
        listView.setAdapter(adapter);
    }
}


