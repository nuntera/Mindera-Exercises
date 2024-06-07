package com.mindera.mindswap;

public class Player {
    private String name;
    private Card[] cards;
    private int cardCount;


    public Player(String name){
        this.name = name;
        cards = new Card[5]; // Fixed size
        cardCount = 0;
    }


    public void displayCards() {
        System.out.println("Player " + name + " cards:");
        for (int i = 0; i < cardCount; i++) {
            cards[i].displayCardDetails();
            System.out.println();
        }
    }


    public void playCard(int cardIndex) {
        if (cardIndex >= 0 && cardIndex < cardCount && !cards[cardIndex].isPlayed()) {
            cards[cardIndex].play();
        } else {
            System.out.println("Invalid card index or card already played.");
        }
    }

    public void addCard(Card card) {
        if (cardCount < cards.length) {
            cards[cardCount++] = card;
        } else {
            System.out.println("Player's hand is full, cannot add more cards.");
        }
    }


    public String getName() {
        return name;
    }

    public Card[] getCards() {
        return cards;
    }
}
