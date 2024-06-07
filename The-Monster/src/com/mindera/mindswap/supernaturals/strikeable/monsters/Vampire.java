package com.mindera.mindswap.supernaturals.strikeable.monsters;

import java.util.Random;


public class Vampire extends Monster{
    private int biteHealthIncrease;
    private double biteChance;

    public Vampire(String name, int health, int attackDamage, int biteHealthIncrease, double biteChance) {
        super(name, health, attackDamage);
        this.biteHealthIncrease = biteHealthIncrease;
        this.biteChance = biteChance;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bite Health Increase: " + this.biteHealthIncrease);
        System.out.println("Bite Chance: " + this.biteChance);
    }

    public int attack() {
        Random random = new Random();
        if (random.nextDouble() <= this.biteChance) {
            receiveDamage(- this.biteHealthIncrease);
            System.out.println("The vampire bites its enemy and gains " + this.biteHealthIncrease + " health!");
        }
        return getAttackDamage();
    }
}

