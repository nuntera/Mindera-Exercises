package com.mindera.mindswap;

public class Game {

    private static final int MIN = 0;
    private static final int MAX = 2;

    private Player player1;
    private Player player2;

    private int player1Wins;
    private int player2Wins;
    private int roundsCounter;


    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        player1Wins = 0;
        player2Wins = 0;
        roundsCounter = 0;
    }


    public void start() {
        System.out.println("Game is starting");

        play();

    }

    private void play() {

        while (player1Wins < 6 && player2Wins < 6 && roundsCounter < 10){
            int player1Choice = RandomGenerator.generate(MIN, MAX);
            int player2Choice = RandomGenerator.generate(MIN, MAX);

            System.out.println("João throws " + Move.getById(player1Choice));
            System.out.println("Maria throws " + Move.getById(player2Choice));

            Player winner = determineWinner(player1Choice, player2Choice);
            calculateBestOfTen(winner);

            printWinner(winner);

            roundsCounter++;

            System.out.println(player1Wins);
            System.out.println(player2Wins);
            System.out.println(roundsCounter);
        }
        if (player1Wins > player2Wins){
            System.out.println(player1.getName() + " wins with " + player1Wins);
        }else System.out.println(player2.getName() + " wins with " + player2Wins);
    }


    private void calculateBestOfTen(Player winner) {
        if (winner == player1){
            player1Wins++;
        }else if (winner == player2){
            player2Wins++;
        }else if (winner == null){
            player1Wins++;
            player2Wins++;
        }
    }


    private void printWinner(Player winner) {
        if(winner==null){
            System.out.println("Its a tie");
        } else {
            System.out.println("Winner is " + winner.getName());
        }
    }


    private Player determineWinner(int player1Choice, int player2Choice) {
        if (Move.getById(player1Choice)==Move.getById(player2Choice)){
            return null;
        }
        switch (Move.values()[0]){
            case Move.ROCK:
                if (Move.getById(player2Choice) == Move.SCISSORS){
                    return player1;
                }
                return player2;
            case Move.SCISSORS:
                if (Move.getById(player2Choice) == Move.PAPER){
                    return player1;
                }
                return player2;
            case Move.PAPER:
                if (Move.getById(player2Choice) == Move.ROCK){
                    return player1;
                }
                return player2;
        }
        return null;
    }
}
