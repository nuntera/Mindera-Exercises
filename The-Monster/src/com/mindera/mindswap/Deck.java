package com.mindera.mindswap;

import com.mindera.mindswap.supernaturals.strikeable.monsters.*;


public class Deck {
    private Card[] cards;
    private int currentIndex;

    public Deck(){
        cards = new Card[6]; // Fixed size
        currentIndex = 0;
        initializePlayersDeck();
    }


    public void displayDeck() {
        for (Card card : cards) {
            if (card != null) {
                card.displayCardDetails();
                System.out.println();
            }
        }
    }

    private void initializePlayersDeck() {
        // Add monster cards to deck
        for (MonsterType monsterType : MonsterType.values()) {
            addCard(new Card(monsterType.getType()));
        }
    }

    private void addCard(Card card) {
        if (currentIndex < cards.length) {
            cards[currentIndex++] = card;
        } else {
            System.out.println("Deck is full, cannot add more cards.");
        }
    }


    public Card[] getCards() {
        return cards;
    }
}
