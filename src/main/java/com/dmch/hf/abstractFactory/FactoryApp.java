package com.dmch.hf.abstractFactory;

import com.dmch.hf.abstractFactory.pizza.Pizza;
import com.dmch.hf.abstractFactory.pizzaStore.PizzaStore;
import com.dmch.hf.abstractFactory.pizzaStore.impl.ChicagoPizzaStore;
import com.dmch.hf.abstractFactory.pizzaStore.impl.NyPizzaStore;

/**
 * Created by Dmitrii on 11.08.2018.
 */
public class FactoryApp {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        Pizza cheese = nyPizzaStore.orderPizza("cheese");

        System.out.println("=========================== ");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza clam = chicagoPizzaStore.orderPizza("clam");

        //        Preparing Ny style Clam pizza
        //        Baking for 25 min at 350 degrees
        //        Cutting the pizza into diagonal slices
        //        Putting pizza into original PizzaStore box
        //        ===========================
        //        Preparing Chicago Clam pizza
        //        Baking for 25 min at 350 degrees
        //        Cutting the pizza into diagonal slices
        //        Putting pizza into original PizzaStore box
    }
}
