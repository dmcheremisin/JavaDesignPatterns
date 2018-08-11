package com.dmch.hf.abstractFactory.ingredientFactory;

import com.dmch.hf.abstractFactory.ingredients.Cheese;
import com.dmch.hf.abstractFactory.ingredients.Clams;
import com.dmch.hf.abstractFactory.ingredients.Dough;
import com.dmch.hf.abstractFactory.ingredients.Sauce;

/**
 * Created by Dmitrii on 11.08.2018.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSause();
    Cheese createCheese();
    Clams createClams();
}
