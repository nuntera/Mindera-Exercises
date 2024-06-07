package com.mindera.mindswap.supernaturals.strikeable.monsters;

import com.mindera.mindswap.supernaturals.Supernatural;
import com.mindera.mindswap.supernaturals.strikeable.Strikeable;


public abstract class Monster extends Supernatural implements Strikeable {
    private int health;

    public Monster(String name, int health, int attackDamage) {
        super(name, attackDamage);
        this.health = health;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Health: " + this.health);
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }
}
