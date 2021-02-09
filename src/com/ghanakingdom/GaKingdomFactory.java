package com.ghanakingdom;

public class GaKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new GaCastle();
    }

    @Override
    public King createKing() {
        return new GaKing();
    }

    @Override
    public Army createArmy() {
        return new GaArmy();
    }
}
