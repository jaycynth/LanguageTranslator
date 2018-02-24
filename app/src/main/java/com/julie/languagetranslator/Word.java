package com.julie.languagetranslator;

/**
 * Created by JULIE on 2/21/2018.
 * this class represent a single portion containing the default word and
 * its translation that allows the dynamic assigning
 */

public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Swahili translation for the word
     */
    private String mSwahiliTranslation;

    //for the image
    private int mImageResourceId= NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    /**
         * Create a new Word object.
        * @param defaultTranslation is the word in a language that the user is already familiar with
        *                          (such as English)
        * @param swahiliTranslation is the word in the Swahili language
     *    constructor-used to create objects from the class definition
     */

    public Word(String defaultTranslation, String swahiliTranslation) {
        mDefaultTranslation = defaultTranslation;
        mSwahiliTranslation = swahiliTranslation;
    }

    public Word(String defaultTranslation, String swahiliTranslation, int ImageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mSwahiliTranslation = swahiliTranslation;
        mImageResourceId = ImageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Swahili translation of the word.
     */
    public String getSwahiliTranslation() {
        return mSwahiliTranslation;
    }

    /**
     *  get the image
     */

    public int getImageResource(){
        return mImageResourceId;
    }
    /*
    returns whether or not ther is an image for the word
     */
    public boolean hasImage(){
       return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

