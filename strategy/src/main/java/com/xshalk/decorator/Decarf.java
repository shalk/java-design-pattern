package com.xshalk.decorator;

/**
 * 脱咖啡因咖啡
 */
public class Decarf extends Beverage {

    public Decarf() {
        description = "Decarf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
