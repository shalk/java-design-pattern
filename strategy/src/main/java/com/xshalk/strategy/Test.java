package com.xshalk.strategy;

public class Test {

    public static void testDuck(Duck duck) {
        duck.display();
        duck.quack();
        duck.performFly();
    }
    public static void main(String[] args) {
        System.out.println("This is Stategy Pattern");
        testDuck(new MallardDuck());
        testDuck(new RedheadDuck());
        testDuck(new RubberDuck());
    }
}
