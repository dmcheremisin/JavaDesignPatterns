package com.dmch.hf.decorator.impl;

import com.dmch.hf.decorator.Beverage;

import java.math.BigDecimal;

/**
 * Created by Dmitrii on 09.08.2018.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
        cost = new BigDecimal("1.99");
    }
}
