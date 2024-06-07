package com.mindera.mindswap;


import com.mindera.mindswap.supernaturals.SupernaturalType;

public class Deck {
    private Card[] cards;
    private int currentIndex;

    public Deck(){
        cards = new Card[10]; // Fixed size
        currentIndex = 0;
        initializeDeck();

    }


    public void displayDeck() {
        for (Card card : cards) {
            if (card != null) {
                card.displayCardDetails();
                System.out.println();
            }
        }
    }

    private void initializeDeck() {
        // Add monster cards to deck
        for (SupernaturalType supernaturalType : SupernaturalType.values()) {
            addCard(new Card(supernaturalType.getSupernatural()));
            /*
            if (!supernaturalType.isObstacle()) {
                addCard(new Card(supernaturalType.getSupernatural()));
            }

             */
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
