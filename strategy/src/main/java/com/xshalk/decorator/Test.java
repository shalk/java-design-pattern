package com.xshalk.decorator;

public class Test {
    public static void test(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }

    public static void main(String[] args) {
        System.out.println("this is decorator Pattern");
        Beverage b1 = new HouseBlend();
        test(b1);

        Beverage b2 = new DarkRoast();
        b2 = new Whip(b2);
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Soy(b2);
        b2 = new SteamedMilk(b2);
        test(b2);
    }
}
