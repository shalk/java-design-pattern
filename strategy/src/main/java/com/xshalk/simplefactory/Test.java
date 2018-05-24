package com.xshalk.simplefactory;

public class Test {
    public Pizza orderPizza(String type) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        System.out.println("this is  Simple Factory ; not a Pattern");
    }
}
