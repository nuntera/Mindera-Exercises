package com.mindera.mindswap.supernaturals.strikeable;

import com.mindera.mindswap.supernaturals.strikeable.monsters.*;

public class MonsterFactory {


    public static Monster generate(MonsterType type){

        switch (type){
            case MUMMY:
                return new Mummy();
            case VAMPIRE:
                return new Vampire();
            case WEREWOLF:
                return new Werewolf();
            default:
                throw new RuntimeException("Not implemented on factory");
        }
    }
}
