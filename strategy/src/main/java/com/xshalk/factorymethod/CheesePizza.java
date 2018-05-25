package com.xshalk.factorymethod;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "cheesePizza";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
