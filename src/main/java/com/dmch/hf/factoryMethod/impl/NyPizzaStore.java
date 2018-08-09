package com.dmch.hf.factoryMethod.impl;

import com.dmch.hf.factoryMethod.Pizza;
import com.dmch.hf.factoryMethod.PizzaStore;

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
