package com.xshalk.strategy;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("this is RedheadDuck");
    }
}
