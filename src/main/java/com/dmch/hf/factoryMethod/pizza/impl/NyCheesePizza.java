package com.dmch.hf.factoryMethod.pizza.impl;

import com.dmch.hf.factoryMethod.pizza.Pizza;

public class NyCheesePizza extends Pizza {
    public NyCheesePizza() {
        this.name = "New York style cheese pizza";
        this.sauce = "Marinara Sauce";
        this.dough = "Thin Crust Dough";
    }
}
