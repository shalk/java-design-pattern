package com.xshalk.decorator;

/**
 * 酱油
 */
public class Soy  extends CondimentDecorator{
    private Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + this.beverage.cost();
    }
}
