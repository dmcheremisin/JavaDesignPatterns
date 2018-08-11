package com.dmch.hf.abstractFactory.pizza;

import com.dmch.hf.abstractFactory.ingredientFactory.PizzaIngredientFactory;
import com.dmch.hf.abstractFactory.ingredients.Cheese;
import com.dmch.hf.abstractFactory.ingredients.Clams;
import com.dmch.hf.abstractFactory.ingredients.Dough;
import com.dmch.hf.abstractFactory.ingredients.Sauce;

/**
 * Created by Dmitrii on 11.08.2018.
 */
public abstract class Pizza {
    private String name;
    private PizzaIngredientFactory pizzaIngredientFactory;

    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Clams clams;

    public Pizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
        this.name = name;
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking for 25 min at 350 degrees");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Putting pizza into original PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public PizzaIngredientFactory getPizzaIngredientFactory() {
        return pizzaIngredientFactory;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name = " + name + '}';
    }
}
