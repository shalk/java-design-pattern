package com.xshalk.visitor;


public class Soldier extends Unit {

    private String name;

    public Soldier(String name, Unit... units) {
        super(units);
        this.name = name;
    }

    @Override
    public void accept(UnitVistor visitor) {
        visitor.visitSoldier(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                '}';
    }
}
