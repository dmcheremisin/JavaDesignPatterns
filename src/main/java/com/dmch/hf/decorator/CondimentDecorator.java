package com.dmch.hf.decorator;

import java.math.BigDecimal;

/**
 * Created by Dmitrii on 09.08.2018.
 */
public abstract class CondimentDecorator extends Beverage {
    protected static BigDecimal cost;
    protected Beverage beverage;

    public abstract String getDescription();

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(cost);
    }
}
