package com.mindera.mindswap;

public enum Move {
    ROCK(0, "Rock"),
    SCISSORS(1, "Scissors"),
    PAPER(2, "Paper");

    private final int id;
    private final String move;


    Move(int id, String move) {
        this.id = id;
        this.move = move;
    }


    public static Move getById(int id) {
        for (Move move : values()) {
            if (move.getId() == id) {
                return move;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }
}
