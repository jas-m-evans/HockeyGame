package com.example.evansjas.hockeygame;

/**
 * Created by EVANSJAS on 9/27/2015.
 */
public class Player extends Card {
    private int offense;
    private int defense;

    public Player() {
        offense = 0;
        defense = 0;
    }

    public int getOffense() {
        return offense;
    }

    public int getDefense() {
        return defense;
    }

    public void setOffense(int offense) {
        this.offense = offense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
