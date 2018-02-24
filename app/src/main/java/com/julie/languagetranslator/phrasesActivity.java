package com.julie.languagetranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class phrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        // Create a list of words
               ArrayList<Word> words = new ArrayList<Word>();
                words.add(new Word("Where are you going?", "Unaenda wapi?"));
                words.add(new Word("What is your name?", "Jina lako nani?"));
                words.add(new Word("My name is...", "Jina langu ni.."));
                words.add(new Word("How are you feeling?", "Unajihisi aje?"));
                words.add(new Word("I’m feeling good.", "Naskia vizuri"));
                words.add(new Word("Are you coming?", "Unakuja?"));
                words.add(new Word("Yes, I’m coming.", "Ndio, naja"));
                words.add(new Word("I’m coming.", "Naja"));
                words.add(new Word("Let’s go.", "Twende"));
                words.add(new Word("Come here.", "Kuja hapa"));


        //the adapter enables the elements in the array list to be to be called into the lis view on demand
        WordAdapter adapter = new WordAdapter(this, words);

        //find the list view
        ListView listView = (ListView) findViewById(R.id.rootView);

        //bind the adapter and the listView
        listView.setAdapter(adapter);
    }
}


