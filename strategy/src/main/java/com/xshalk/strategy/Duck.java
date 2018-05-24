package com.xshalk.strategy;

abstract public class Duck {


    FlyBehavior flyBehavior;

    public void quack() {
        System.out.println("gua gua gua");
    }

    public void swim() {
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}