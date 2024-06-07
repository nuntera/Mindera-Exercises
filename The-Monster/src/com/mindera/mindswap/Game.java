package com.mindera.mindswap;


public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }


    public void start() {
        System.out.println("Starting the game!");

        this.player1.displayCards();

        this.player2.displayCards();


    }
}
