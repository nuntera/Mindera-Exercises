package com.mindera.mindswap.supernaturals.strikeable.monsters;


public class Mummy extends Monster{
    private int attackCount;
    private int maxConsecutiveAttacks;
    private int unrollDamage;

    public Mummy(String name, int health, int attackDamage, int maxConsecutiveAttacks, int unrollDamage) {
        super(name, health, attackDamage);
        this.attackCount = 0;
        this.maxConsecutiveAttacks = maxConsecutiveAttacks;
        this.unrollDamage = unrollDamage;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Attack count: " + this.attackCount);
        System.out.println("Bite health increase: " + this.maxConsecutiveAttacks);
        System.out.println("Unroll damage: " + this.unrollDamage);
    }

    public int attack() {
        if (this.attackCount < this.maxConsecutiveAttacks) {
            this.attackCount++;
            return getAttackDamage();
        } else {
            receiveDamage(this.unrollDamage);
            this.attackCount = 0; // Reset attack count
            System.out.println("The mummy unrolls and loses " + this.unrollDamage + " health!");
            return 0; // Attack fails
        }
    }
}
