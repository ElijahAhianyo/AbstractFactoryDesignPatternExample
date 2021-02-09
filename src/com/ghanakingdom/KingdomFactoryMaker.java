package com.ghanakingdom;

public class KingdomFactoryMaker {
    public KingdomFactory makeFactory(KingdomFactoryTypes kingdomFactoryTypes){
        switch (kingdomFactoryTypes){
            case GA:
                return new GaKingdomFactory();
            case ASHANTI:
                return new AshantiKingdomFactory();
            default:
                throw new IllegalArgumentException("This kingdom is dead, enter a valid kingdom or create yours");
        }
    }
}

