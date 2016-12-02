package com.mycompany.cardview;

class Album {

    private String name;
    private int numOfSongs;
    private int thumbnail;

    Album(String name, int numOfSongs, int thumbnail) {
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    int getNumOfSongs() {
        return numOfSongs;
    }

    int getThumbnail() {
        return thumbnail;
    }
}
