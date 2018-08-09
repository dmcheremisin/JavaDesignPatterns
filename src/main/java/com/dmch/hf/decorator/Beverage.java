package com.dmch.hf.decorator;

import java.math.BigDecimal;

/**
 * Created by Dmitrii on 09.08.2018.
 */
public abstract class Beverage {
    protected String description = "Unknown beverage";
    protected SIZE size = SIZE.SMALL;

    public SIZE getSize() {
        return size;
    }
    public void setSize(SIZE size) {
        this.size = size;
    }
    public String getDescription() {
        return description;
    }

    public abstract BigDecimal cost();
}
