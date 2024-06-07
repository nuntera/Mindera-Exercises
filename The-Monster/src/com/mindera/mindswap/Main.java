package com.mindera.mindswap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Pedro");
        Player player2 = new Player("Maria");

        Deck cardDeck = new Deck();
        //System.out.println(Arrays.toString(cardDeck.getCards()));
        distributeCardsTo(player1, player2, cardDeck);

        Game monsterGame = new Game(player1, player2);
        monsterGame.start();
    }


    private static void distributeCardsTo(Player player1, Player player2, Deck cardDeck) {
        // Distribute cards to players
        Card[] cards = cardDeck.getCards();
        int halfDeckSize = cards.length / 2;

        for (int i = 0; i < cards.length; i++) {
            if (cards[i] != null) {
                if (i < halfDeckSize){
                    player1.addCard(cards[i]);
                } else {
                    player2.addCard(cards[i]);
                }
            }
        }
    }
}
