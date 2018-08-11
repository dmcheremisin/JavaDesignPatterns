package com.dmch.hf.factoryMethod.store.impl;

import com.dmch.hf.factoryMethod.pizza.Pizza;
import com.dmch.hf.factoryMethod.store.PizzaStore;
import com.dmch.hf.factoryMethod.pizza.impl.ChicagoCheesePizza;
import com.dmch.hf.factoryMethod.pizza.impl.ChicagoFourSeasonsPizza;

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
