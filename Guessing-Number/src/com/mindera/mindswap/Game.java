package com.mindera.mindswap;

public class Game {
    private static final int MIN = 1;
    private static final int MAX = 10;

    private final Player player1;
    private final Player player2;

    private int gameRound;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        gameRound = 0;
    }


    public void start() {
        System.out.println("Game is starting");
        printPlayersName(player1.getName(), player2.getName());

        boolean winnerFound = false;

        while (!winnerFound) {
            gameRound++;
            System.out.println("Round " + gameRound);

            int gameNumber = RandomGenerator.generate(MIN, MAX);
            int player1Number = this.player1.pickNumber(MIN, MAX);
            int player2Number = this.player2.pickNumber(MIN, MAX);

            winnerFound = determineWinner(gameNumber, player1Number, player2Number);
        }
    }

    private boolean determineWinner(int gameNumber, int player1Number, int player2Number) {
        System.out.println("The game number is: " + gameNumber);
        System.out.println(this.player1.getName() + " number is: " + player1Number);
        System.out.println(this.player2.getName() + " number is: " + player2Number);

        if (gameNumber == player1Number) {
            System.out.println(player1.getName() + " wins this round!");
            return true;
        } else if (gameNumber == player2Number) {
            System.out.println(player2.getName() + " wins this round!");
            return true;
        } else {
            System.out.println("It's a tie! No winner this round.");
            return false;
        }
    }

    private void printPlayersName(String player1Name, String player2Name) {
        System.out.println("Players: " + player1Name + " VS " + player2Name);
    }
}
