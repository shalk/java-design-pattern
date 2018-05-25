package com.xshalk.decorator;

public abstract class Beverage {
    String description = "unkown beverage";

    public String getDescription() {
        return description;
    }

    abstract public double cost();
}
