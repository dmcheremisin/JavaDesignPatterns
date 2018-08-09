package com.dmch.hf.decorator;

import java.math.BigDecimal;

/**
 * Created by Dmitrii on 09.08.2018.
 */
public abstract class Beverage {
    protected String description = "Unknown beverage";
    protected SIZE size = SIZE.SMALL;
    protected BigDecimal cost;

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal cost() {
        BigDecimal costDependingOnSize = getCostDependingOnSize(cost);
        return costDependingOnSize;
    }

    public BigDecimal getCostDependingOnSize(BigDecimal cost){
        BigDecimal costWithSize = cost;
        switch(size){
            case MEDIUM:
                costWithSize = cost.add(new BigDecimal("0.10"));
                break;
            case LARGE:
                costWithSize = cost.add(new BigDecimal("0.20"));
                break;
        }
        return costWithSize;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
