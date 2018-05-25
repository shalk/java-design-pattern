package com.xshalk.factorymethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("this is Factory Method Pattern");
//        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new NYStylePizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
