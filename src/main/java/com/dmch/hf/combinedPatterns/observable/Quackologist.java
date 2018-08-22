package com.dmch.hf.combinedPatterns.observable;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("Duck: " + quackObservable.getClass().getSimpleName() + " just quacked");
    }
}
