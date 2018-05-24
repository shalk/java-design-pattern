package com.xshalk.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("this is MallardDuck");
    }
}
