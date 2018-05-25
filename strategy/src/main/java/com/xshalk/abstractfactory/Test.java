package com.xshalk.abstractfactory;

public class Test {
    public static void main(String[] args) {
        System.out.println("this abstract factory");
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        PizzaBox box = new PizzaBox(factory);
        box.displayIngredient();

    }
}
