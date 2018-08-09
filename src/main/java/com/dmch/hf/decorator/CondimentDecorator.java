package com.dmch.hf.decorator;

import java.math.BigDecimal;

/**
 * Created by Dmitrii on 09.08.2018.
 */
public abstract class CondimentDecorator extends Beverage {
    protected BigDecimal cost;
    protected Beverage beverage;

    public abstract String getDescription();

    @Override
    public void setSize(SIZE size) {
        this.size = size;
        this.beverage.setSize(size);
    }

    @Override
    public BigDecimal cost() {
        BigDecimal costDependingOnSize = getCostDependingOnSize(cost);
        return beverage.cost().add(costDependingOnSize);
    }
}
