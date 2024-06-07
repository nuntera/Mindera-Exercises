package com.mindera.mindswap.supernaturals;

import com.mindera.mindswap.supernaturals.fairies.Fairy;
import com.mindera.mindswap.supernaturals.strikeable.Witch;
import com.mindera.mindswap.supernaturals.strikeable.monsters.Mummy;
import com.mindera.mindswap.supernaturals.strikeable.monsters.Vampire;
import com.mindera.mindswap.supernaturals.strikeable.monsters.Werewolf;


public enum SupernaturalType {
    FAIRY(0, new Fairy("Fairy", 10), true, false),
    WITCH(1, new Witch("Witch", 100, 10), true, true),
    WEREWOLF(2, new Werewolf("Werewolf",120, 10), false, true),
    VAMPIRE(3, new Vampire("Vampire", 100, 10, 1, 0.5), false, true),
    MUMMY(4, new Mummy("Mummy", 100, 10, 2, 1), false, true);


    private final int id;
    private final Supernatural supernatural;
    private final boolean isObstacle;
    private final boolean isStrikeable;


    SupernaturalType(int id, Supernatural supernatural, boolean isObstacle, boolean isStrikeable){
        this.id = id;
        this.supernatural = supernatural;
        this.isObstacle = isObstacle;
        this.isStrikeable = isStrikeable;
    }


    public int getId() {
        return id;
    }

    public Supernatural getSupernatural() {
        return supernatural;
    }

    public boolean isObstacle() {
        return isObstacle;
    }

    public boolean isStrikeable() {
        return isStrikeable;
    }
}
