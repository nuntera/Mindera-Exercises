package com.mindera.mindswap;

import com.mindera.mindswap.supernaturals.strikeable.monsters.Monster;


public class Card {
    private Monster monster;
    private boolean isPlayed;

    public Card(Monster monster) {
        this.monster = monster;
        isPlayed = false;
    }


    public void displayCardDetails() {
        this.monster.displayDetails();
        System.out.println("Is Played: " + isPlayed);
    }

    public void play() {
        isPlayed = true;
    }


    public Monster getMonster() {
        return monster;
    }

    public boolean isPlayed() {
        return isPlayed;
    }
}
