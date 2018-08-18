package com.dmch.hf.combinedPatterns.ducksImpl;

import com.dmch.hf.combinedPatterns.Quackable;
import com.dmch.hf.combinedPatterns.observable.Observable;
import com.dmch.hf.combinedPatterns.observable.Observer;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class RedheadDuck implements Quackable {
    Observable observable = new Observable(this);

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
