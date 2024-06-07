package com.mindera.mindswap.supernaturals.strikeable.monsters;


public class Werewolf extends Monster{

    public Werewolf(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }


    @Override
    public int attack() {
        return getAttackDamage();
    }
}
