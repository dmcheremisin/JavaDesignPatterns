package com.dmch.hf.factoryMethod.impl;

import com.dmch.hf.factoryMethod.Pizza;
import com.dmch.hf.factoryMethod.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoCheesePizza();
            case "fourseasons":
                return new ChicagoFourSeasonsPizza();
            default:
                throw new RuntimeException("No such pizza found with name: " + type);
        }
    }
}
