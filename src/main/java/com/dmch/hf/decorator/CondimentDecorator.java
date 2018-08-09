package com.dmch.hf.decorator;

import java.math.BigDecimal;

/**
 * Created by Dmitrii on 09.08.2018.
 */
public abstract class CondimentDecorator extends Beverage {
    protected BigDecimal cost;
    protected Beverage beverage;
    protected SIZE size;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    public abstract String getDescription();

    @Override
    public void setSize(SIZE size) {
        beverage.setSize(size);
    }

    @Override
    public BigDecimal cost() {
        BigDecimal costWithSize = BigDecimal.ZERO;
        switch(size){
            case SMALL:
                costWithSize = cost;
                break;
            case MEDIUM:
                costWithSize = cost.add(new BigDecimal("0.10"));
                break;
            case LARGE:
                costWithSize = cost.add(new BigDecimal("0.20"));
                break;
        }
        return beverage.cost().add(costWithSize);
    }
}
