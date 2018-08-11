package com.dmch.hf.factoryMethod;

import com.dmch.hf.factoryMethod.store.impl.ChicagoPizzaStore;
import com.dmch.hf.factoryMethod.store.impl.NyPizzaStore;
import com.dmch.hf.factoryMethod.pizza.Pizza;
import com.dmch.hf.factoryMethod.store.PizzaStore;

public class PizzaApp {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyFourSeasons = nyPizzaStore.orderPizza("fourseasons");
        System.out.println();
        Pizza chicagoCheese = chicagoPizzaStore.orderPizza("cheese");
//
//        Preparing New York style four seasons pizza
//        Tossing dough...New York style four seasons pizza
//        Adding sauce...New York style four seasons pizza
//        Baking for 25 min at 350 degrees
//        Cutting the pizza into diagonal slices
//        Putting pizza into original PizzaStore box
//
//        Preparing Chicago style cheese pizza
//        Tossing dough...Chicago style cheese pizza
//        Adding sauce...Chicago style cheese pizza
//        Baking for 25 min at 350 degrees
//        Cutting the pizza into square pieces
//        Putting pizza into original PizzaStore box
    }
}
