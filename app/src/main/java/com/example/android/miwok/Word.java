package com.example.android.miwok;


public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String DefaultTranslation, String MiwokTranslation) {
        mMiwokTranslation = MiwokTranslation;
        mDefaultTranslation = DefaultTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


}
