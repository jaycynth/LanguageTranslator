package com.julie.languagetranslator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JULIE on 2/21/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words   is the list of words to be displayed.
     */
    public WordAdapter(Context context, ArrayList<Word> words) {

        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID swahili_view.
        TextView swahiliTextView = (TextView) listItemView.findViewById(R.id.swahili_textView);
        // Get the swahili translation from the currentWord object and set this text on
        // the swahili TextView.
        swahiliTextView.setText(currentWord.getSwahiliTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_textView.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_textView);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(currentWord.getDefaultTranslation());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResource());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
