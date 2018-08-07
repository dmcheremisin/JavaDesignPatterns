package com.dmch.hf.strategy.realization;

import com.dmch.hf.strategy.Duck;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm looking like a real duck in order to attract them");
    }
}
