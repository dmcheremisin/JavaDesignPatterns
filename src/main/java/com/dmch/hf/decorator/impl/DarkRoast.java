package com.dmch.hf.decorator.impl;

import com.dmch.hf.decorator.Beverage;

import java.math.BigDecimal;

/**
 * Created by Dmitrii on 09.08.2018.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Black Roast";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("0.99");
    }
}
