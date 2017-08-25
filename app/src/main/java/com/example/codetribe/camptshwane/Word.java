package com.example.codetribe.camptshwane;


public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    private String mURL;



    /**Image resource ID for the word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word*/
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranslation) {
        mDefaultTranslation = defaultTranslation;

    }



    public Word(String defaultTranslation, int imageResourcesId){
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourcesId;

    }

    public Word(String mDefaultTranslation, String mURL, int mImageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mURL = mURL;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmURL() {
        return mURL;
    }

    public void setmURL(String mURL) {
        this.mURL = mURL;
    }
    /**
     * Get the default translation of the word
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }



     public int getImageResource() {
         return mImageResourceId;
     }

     public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }


}
