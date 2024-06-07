package com.mindera.mindswap.supernaturals;


import java.util.Random;

public abstract class Supernatural {
    private String name;
    private int attackDamage;

    public Supernatural(String name, int attackDamage){
        this.name = name;
        this.attackDamage = attackDamage;
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Attack Damage: " + attackDamage);
    }


    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
}
