package com.ghanakingdom;

public class AshantiKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new AshantiCastle();
    }

    @Override
    public King createKing() {
        return new AshantiKing();
    }

    @Override
    public Army createArmy() {
        return new AshantiArmy();
    }
}
