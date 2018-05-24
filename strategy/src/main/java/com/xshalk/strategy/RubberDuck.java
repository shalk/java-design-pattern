package com.xshalk.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
    }
    @Override
    public void quack() {
        System.out.println("I can't quack");
    }

    @Override
    public void display() {
        System.out.println("this is RubberDuck");
    }
}
