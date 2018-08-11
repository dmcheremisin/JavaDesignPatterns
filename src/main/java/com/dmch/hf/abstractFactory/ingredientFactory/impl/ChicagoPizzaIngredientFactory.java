package com.dmch.hf.abstractFactory.ingredientFactory.impl;

import com.dmch.hf.abstractFactory.ingredientFactory.PizzaIngredientFactory;
import com.dmch.hf.abstractFactory.ingredients.Cheese;
import com.dmch.hf.abstractFactory.ingredients.Clams;
import com.dmch.hf.abstractFactory.ingredients.Dough;
import com.dmch.hf.abstractFactory.ingredients.Sauce;
import com.dmch.hf.abstractFactory.ingredients.impl.FrozenClams;
import com.dmch.hf.abstractFactory.ingredients.impl.MozarellaCheese;
import com.dmch.hf.abstractFactory.ingredients.impl.PlumTomatoSause;
import com.dmch.hf.abstractFactory.ingredients.impl.ThickCrustDough;

/**
 * Created by Dmitrii on 11.08.2018.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSause() {
        return new PlumTomatoSause();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
