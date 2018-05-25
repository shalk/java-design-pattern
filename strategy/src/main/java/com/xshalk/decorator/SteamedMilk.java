package com.xshalk.decorator;

public class SteamedMilk extends CondimentDecorator {

    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", SteamedMilk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
