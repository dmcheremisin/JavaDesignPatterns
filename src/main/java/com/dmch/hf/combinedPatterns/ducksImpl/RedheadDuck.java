package com.dmch.hf.combinedPatterns.ducksImpl;

import com.dmch.hf.combinedPatterns.Quackable;
import com.dmch.hf.combinedPatterns.observable.Observer;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void registerDuck(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
