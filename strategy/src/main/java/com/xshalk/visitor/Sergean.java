package com.xshalk.visitor;

public class Sergean extends Unit {
    private String name;

    public Sergean(String name, Unit... units) {
        super(units);
        this.name = name;
    }

    @Override
    public void accept(UnitVistor visitor) {
        visitor.visitSergean(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Sergean{" +
                "name='" + name + '\'' +
                '}';
    }
}
