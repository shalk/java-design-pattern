package com.xshalk.visitor;

public abstract class Unit {

    private Unit[] children;

    public Unit(Unit... units) {
        this.children = units;
    }

    public void accept(UnitVistor visitor) {
        for (Unit child : children) {
            child.accept(visitor);
        }
    }

}
