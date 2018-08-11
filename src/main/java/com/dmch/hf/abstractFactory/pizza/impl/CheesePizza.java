package com.dmch.hf.abstractFactory.pizza.impl;

import com.dmch.hf.abstractFactory.ingredientFactory.PizzaIngredientFactory;
import com.dmch.hf.abstractFactory.pizza.Pizza;

/**
 * Created by Dmitrii on 11.08.2018.
 */
public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super("Cheese pizza", pizzaIngredientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = getPizzaIngredientFactory().createDough();
        sauce = getPizzaIngredientFactory().createSause();
        cheese = getPizzaIngredientFactory().createCheese();
    }
}
