package com.dmch.hf.combinedPatterns.decorator;

import com.dmch.hf.combinedPatterns.Quackable;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class QuackCounter implements Quackable {
    private static int counter = 0;
    private Quackable quackable;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        counter++;
    }

    public static int getQuacks() {
        return counter;
    }
}
