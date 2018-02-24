package com.julie.languagetranslator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

      // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, numbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);

       // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, phrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        // Find the View that shows the colors category
            TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on that View
            colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, colorsActivity.class);
                startActivity(colorsIntent);
            }
        });
        // Find the view that shows the family category
           TextView family = (TextView)findViewById(R.id.family);
        //set a click listener on that view
           family.setOnClickListener(new View.OnClickListener(){
               // The code in this method will be executed when the family View is clicked on.
               @Override
               public void onClick(View view) {
                   Intent familyIntent = new Intent(MainActivity.this, familyActivity.class);
                   startActivity(familyIntent);
               }
           });

    }



}
