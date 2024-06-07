package com.mindera.mindswap;

import com.mindera.mindswap.supernaturals.Supernatural;


public class Card {
    private Supernatural supernatural;
    private boolean isPlayed;


    public Card(Supernatural supernatural) {
        this.supernatural = supernatural;
        this.isPlayed = false;
    }


    public void displayCardDetails() {
        supernatural.displayDetails();
        System.out.println("Is Played: " + isPlayed);
    }

    public void play() {
        isPlayed = true;
    }


    public boolean isPlayed() {
        return isPlayed;
    }
}
