package com.mindera.mindswap;


public class Main {

    public static void main(String[] args) {

    Player player1 = new Player("João");
    Player player2 = new Player("Maria");

    Game game = new Game(player1, player2);

    game.start();

    }
}
