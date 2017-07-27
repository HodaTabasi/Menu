package com.example.msi.popupmenu;

import java.util.List;

/**
 * Created by M.S.I on 7/27/2017.
 */

public class Category {
    private String Categoree;
    private List<Game> games;

    public Category(String categoree, List<Game> games) {
        Categoree = categoree;
        this.games = games;
    }

    public String getCategoree() {
        return Categoree;
    }

    public void setCategoree(String categoree) {
        Categoree = categoree;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
