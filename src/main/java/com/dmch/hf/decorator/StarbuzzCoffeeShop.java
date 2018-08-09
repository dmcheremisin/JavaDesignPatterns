package com.dmch.hf.decorator;

import com.dmch.hf.decorator.impl.DarkRoast;
import com.dmch.hf.decorator.impl.Espresso;
import com.dmch.hf.decorator.impl.HouseBlend;
import com.dmch.hf.decorator.impl.Milk;
import com.dmch.hf.decorator.impl.Mocha;
import com.dmch.hf.decorator.impl.Soy;
import com.dmch.hf.decorator.impl.Whip;

/**
 * Created by Dmitrii on 09.08.2018.
 */
public class StarbuzzCoffeeShop {
    public static void main(String[] args) {
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Whip(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + ": cost $" + beverage1.cost());

        beverage1.setSize(SIZE.MEDIUM);
        System.out.println(beverage1.getDescription() + ": cost $" + beverage1.cost());
        
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + ": cost $" + beverage2.cost());
    }
}
