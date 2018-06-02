package com.xshalk.visitor;

public class Commander extends Unit {
    private String name;

    public Commander(String name, Unit... units) {
        super(units);
        this.name = name;
    }

    @Override
    public void accept(UnitVistor visitor) {
        visitor.visitCommander(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Commander{" +
                "name='" + name + '\'' +
                '}';
    }
}
