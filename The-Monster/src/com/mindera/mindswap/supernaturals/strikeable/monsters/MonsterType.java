package com.mindera.mindswap.supernaturals.strikeable.monsters;


public enum MonsterType {
    WEREWOLF(0, new Werewolf()),
    VAMPIRE(1, new Vampire()),
    MUMMY(2, new Mummy());

    private final int id;
    private final Monster type;

    MonsterType(int id, Monster type) {
        this.id = id;
        this.type = type;
    }


    /*
    public static MoveType getById(int id) {
        for (MoveType move : values()) {
            if (move.getId() == id) {
                return move;
            }
        }
        return null;
    }

     */


    public Monster getType() {
        return type;
    }
}
