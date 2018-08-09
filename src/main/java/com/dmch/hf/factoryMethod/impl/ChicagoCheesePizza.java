package com.dmch.hf.factoryMethod.impl;

import com.dmch.hf.factoryMethod.Pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        this.name = "Chicago style cheese pizza";
        this.sauce = "Plum Tomato Sauce";
        this.dough = "Extra Thick Crust Dough";
    }

    @Override
    protected void cut() {
        System.out.println("Cutting the pizza into square pieces");
    }
}
