package com.dmch.hf.adapter.impl;

import com.dmch.hf.adapter.Duck;
import com.dmch.hf.adapter.Turkey;

/**
 * Created by Dmitrii on 14.08.2018.
 */
public class TurkeyToDuckAdapter implements Duck {
    private Turkey turkey;

    public TurkeyToDuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.makeSound();
    }

    @Override
    public void fly() {
        turkey.tryToFly();
    }
}
