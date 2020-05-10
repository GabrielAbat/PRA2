package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "comics")



public class Comic {



    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "comicId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "comicTitle")
    private String mTitle;

    private String mPublishingCompany;

    public Comic(@Nullable String title, String publishingCompany, int score, String creationDate) {
        mTitle = title;
        mPublishingCompany = publishingCompany;
        mScore = score;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getPublishingCompany() {
        return mPublishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        mPublishingCompany = publishingCompany;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        mScore = score;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mScore;
    private String mCreationDate;

}
