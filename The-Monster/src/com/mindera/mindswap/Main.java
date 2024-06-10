package com.mindera.mindswap;


public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Pedro");
        Player player2 = new Player("Maria");

        Game monsterGame = new Game(player1, player2);
        // get the number of initial cards

        // game start
        monsterGame.start();
    }
}
