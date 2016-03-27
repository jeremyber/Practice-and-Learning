package com.jeremyber.top10downloader;

/**
 * Created by Jeremy on 3/22/2016.
 */
public class Application {

    private String name;
    private String artist;
    private String releaseDate;

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Artist: " +  getArtist() + "\n" +
                "Release Date: " + getReleaseDate();
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setName(String name) {
        this.name = name;
    }
}
