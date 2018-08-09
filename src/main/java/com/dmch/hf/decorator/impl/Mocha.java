package com.dmch.hf.decorator.impl;

import com.dmch.hf.decorator.Beverage;
import com.dmch.hf.decorator.CondimentDecorator;

import java.math.BigDecimal;

/**
 * Created by Dmitrii on 09.08.2018.
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        description = "Mocha";
        this.beverage = beverage;
        this.size = beverage.getSize();
        cost = new BigDecimal("0.20");
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
