package com.xshalk.decorator;

/**
 * 深色焙制咖啡
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
