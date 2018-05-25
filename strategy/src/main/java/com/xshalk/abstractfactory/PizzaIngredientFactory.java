package com.xshalk.abstractfactory;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSause();

    Cheese createCheese();
}
