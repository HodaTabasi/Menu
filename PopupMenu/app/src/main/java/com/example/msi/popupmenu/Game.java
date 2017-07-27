package com.example.msi.popupmenu;

/**
 * Created by M.S.I on 7/26/2017.
 */

public class Game {
    private String Name;
    private int Range;
    private int image;

    public Game(String name, int range, int image) {

        Name = name;
        Range = range;
        this.image = image;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRange() {
        return Range;
    }

    public void setRange(int range) {
        Range = range;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
