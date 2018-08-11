package com.dmch.hf.abstractFactory.pizzaStore.impl;

import com.dmch.hf.abstractFactory.ingredientFactory.PizzaIngredientFactory;
import com.dmch.hf.abstractFactory.ingredientFactory.impl.ChicagoPizzaIngredientFactory;
import com.dmch.hf.abstractFactory.pizza.Pizza;
import com.dmch.hf.abstractFactory.pizza.impl.CheesePizza;
import com.dmch.hf.abstractFactory.pizza.impl.ClamPizza;
import com.dmch.hf.abstractFactory.pizzaStore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore() {
        super(new ChicagoPizzaIngredientFactory());
    }

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(getPizzaIngredientFactory());
                pizza.setName("Chicago " + pizza.getName());
            case "clam":
                pizza = new ClamPizza(getPizzaIngredientFactory());
                pizza.setName("Chicago " + pizza.getName());
        }
        return pizza;
    }
}
