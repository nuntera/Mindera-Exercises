package com.mindera.mindswap;

import com.mindera.mindswap.supernaturals.strikeable.MonsterFactory;
import com.mindera.mindswap.supernaturals.strikeable.monsters.*;

import java.util.Random;


public class Deck {
    private Card[] cards;
    private int currentIndex;
    private static final Random random = new Random();

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
       MonsterType[] array= MonsterType.values();

        for (int i = 0; i < cards.length; i++) {
            MonsterType monsterType = array[random.nextInt(array.length)]; //should be random abd not 0
            cards[i] = new Card(MonsterFactory.generate(monsterType));

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
