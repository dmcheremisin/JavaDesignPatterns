package com.dmch.hf.abstractFactory.pizzaStore;

import com.dmch.hf.abstractFactory.ingredientFactory.PizzaIngredientFactory;
import com.dmch.hf.abstractFactory.pizza.Pizza;


public abstract class PizzaStore {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public PizzaStore(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    protected abstract Pizza createPizza(String type);

    public PizzaIngredientFactory getPizzaIngredientFactory() {
        return pizzaIngredientFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
