package com.dmch.hf.factoryMethod.pizza.impl;

import com.dmch.hf.factoryMethod.pizza.Pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        this.name = "Chicago style cheese pizza";
        this.sauce = "Plum Tomato Sauce";
        this.dough = "Extra Thick Crust Dough";
    }

    @Override
    public   void cut() {
        System.out.println("Cutting the pizza into square pieces");
    }
}
