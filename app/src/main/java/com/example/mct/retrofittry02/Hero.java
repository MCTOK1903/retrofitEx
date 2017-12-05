package com.example.mct.retrofittry02;

/**
 * Created by MCT on 12/5/2017.
 */

public class Hero {

    private String name;
    private String realname;
    private String team;
    private String firsttappearance;
    private String createdby;
    private String publisher;
    private String imageurl;
    private String bio;

    public Hero(String name, String realname, String team, String firsttappearance, String createdby, String publisher, String imageurl, String bio) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firsttappearance = firsttappearance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageurl = imageurl;
        this.bio = bio;

    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirsttappearance() {
        return firsttappearance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getBio() {
        return bio;
    }
}
