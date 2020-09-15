package com.example.miwok;

public class Word {

    private int mDefaultTranslationId;

    private int mMiwokTranslationId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourseId;

    public Word(int defaultTranslationId, int miwokTranslationId, int imageResourceId, int audioResourseId) {
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mImageResourceId = imageResourceId;
        mAudioResourseId = audioResourseId;
    }

    public Word(int defaultTranslationId, int miwokTranslationId, int audioResourseId) {
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mAudioResourseId = audioResourseId;
    }

    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }

    public int getMiwokTranslationId() {
        return mMiwokTranslationId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourseId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
