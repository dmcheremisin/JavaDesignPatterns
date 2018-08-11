package com.dmch.hf.abstractFactory.ingredientFactory.impl;

import com.dmch.hf.abstractFactory.ingredientFactory.PizzaIngredientFactory;
import com.dmch.hf.abstractFactory.ingredients.Cheese;
import com.dmch.hf.abstractFactory.ingredients.Clams;
import com.dmch.hf.abstractFactory.ingredients.Dough;
import com.dmch.hf.abstractFactory.ingredients.Sauce;
import com.dmch.hf.abstractFactory.ingredients.impl.FreshClams;
import com.dmch.hf.abstractFactory.ingredients.impl.MarinaraSauce;
import com.dmch.hf.abstractFactory.ingredients.impl.ReggianoCheese;
import com.dmch.hf.abstractFactory.ingredients.impl.ThinCrustDough;

/**
 * Created by Dmitrii on 11.08.2018.
 */
public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSause() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
