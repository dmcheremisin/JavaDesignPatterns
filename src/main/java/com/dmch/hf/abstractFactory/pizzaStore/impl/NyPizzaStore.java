package com.dmch.hf.abstractFactory.pizzaStore.impl;

import com.dmch.hf.abstractFactory.ingredientFactory.PizzaIngredientFactory;
import com.dmch.hf.abstractFactory.ingredientFactory.impl.NyPizzaIngredientFactory;
import com.dmch.hf.abstractFactory.pizza.Pizza;
import com.dmch.hf.abstractFactory.pizza.impl.CheesePizza;
import com.dmch.hf.abstractFactory.pizza.impl.ClamPizza;
import com.dmch.hf.abstractFactory.pizzaStore.PizzaStore;

public class NyPizzaStore extends PizzaStore {
    public NyPizzaStore() {
        super(new NyPizzaIngredientFactory());
    }

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(getPizzaIngredientFactory());
                pizza.setName("Ny style " + pizza.getName());
            case "clam":
                pizza = new ClamPizza(getPizzaIngredientFactory());
                pizza.setName("Ny style " + pizza.getName());
        }
        return pizza;
    }
}
