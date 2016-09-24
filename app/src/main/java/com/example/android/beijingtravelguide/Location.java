package com.example.android.beijingtravelguide;

/**
 * Created by wenshuo on 2016/9/23.
 */
public class Location {
    private String mTitle;
    private String mDescription;
    private String mOpenHours;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String title, String description, String openHours, int imageResourceId) {
        mTitle = title;
        mDescription = description;
        mOpenHours = openHours;
        mImageResourceId = imageResourceId;
    }

    public Location(String title, String description, String openHours) {
        mTitle = title;
        mDescription = description;
        mOpenHours = openHours;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getOpenHours() {
        return mOpenHours;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
