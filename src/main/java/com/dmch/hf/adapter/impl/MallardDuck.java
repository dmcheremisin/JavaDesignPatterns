package com.dmch.hf.adapter.impl;

import com.dmch.hf.adapter.Duck;

/**
 * Created by Dmitrii on 14.08.2018.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying high!");
    }
}
