package com.ghanakingdom;

public class Main {

    public static void main(String[] args) {

        // create AshantiKingdom factory using the factorymaker
        KingdomFactoryMaker kingdomFactoryMaker = new KingdomFactoryMaker();
        KingdomFactory ashantiKingdomFactoryObject = kingdomFactoryMaker.makeFactory(KingdomFactoryTypes.ASHANTI);
        System.out.println(ashantiKingdomFactoryObject.createArmy().nameOfArmy());
    }
}
