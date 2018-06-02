package com.xshalk.visitor;

public interface UnitVistor {
    void visitSoldier(Soldier soldier);

    void visitSergean(Sergean sergean);

    void visitCommander(Commander commander);
}
