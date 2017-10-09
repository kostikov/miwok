package com.example.android.miwok;


public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceID;

    public Word(String DefaultTranslation, String MiwokTranslation, int image, int audioResourceID) {
        mMiwokTranslation = MiwokTranslation;
        mDefaultTranslation = DefaultTranslation;
        mImageResourceId = image;
        mAudioResourceID = audioResourceID;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, int audioResourceID) {
        mMiwokTranslation = MiwokTranslation;
        mDefaultTranslation = DefaultTranslation;
        mAudioResourceID = audioResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getAudioResourceID() {
        return mAudioResourceID;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResource() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
