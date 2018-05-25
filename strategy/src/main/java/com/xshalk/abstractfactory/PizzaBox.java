package com.xshalk.abstractfactory;

public class PizzaBox {
    private PizzaIngredientFactory factory;

    public PizzaBox(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public void displayIngredient() {
        Sauce sauce = factory.createSause();
        Cheese cheese = factory.createCheese();
        Dough dough = factory.createDough();
        System.out.print("this is pizza box:");
        System.out.println(sauce + "," + dough + "," + cheese);
    }

}
