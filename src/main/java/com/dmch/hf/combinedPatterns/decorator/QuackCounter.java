package com.dmch.hf.combinedPatterns.decorator;

import com.dmch.hf.combinedPatterns.Quackable;
import com.dmch.hf.combinedPatterns.observable.Observable;
import com.dmch.hf.combinedPatterns.observable.Observer;

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

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
