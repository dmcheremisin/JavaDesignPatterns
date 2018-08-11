package com.dmch.hf.factoryMethod.store.impl;

import com.dmch.hf.factoryMethod.pizza.Pizza;
import com.dmch.hf.factoryMethod.store.PizzaStore;
import com.dmch.hf.factoryMethod.pizza.impl.NyCheesePizza;
import com.dmch.hf.factoryMethod.pizza.impl.NyFourSeasonsPizza;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NyCheesePizza();
            case "fourseasons":
                return new NyFourSeasonsPizza();
            default:
                throw new RuntimeException("No such pizza found with name: " + type);
        }
    }
}
