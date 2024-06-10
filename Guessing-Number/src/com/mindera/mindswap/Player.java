package com.mindera.mindswap;

public class Player {
    private final String name;

    public Player(String name) {
        this.name = name;
    }


    public int pickNumber(int min, int max) {
        return RandomGenerator.generate(min, max);
    }


    public String getName() {
        return name;
    }
}
