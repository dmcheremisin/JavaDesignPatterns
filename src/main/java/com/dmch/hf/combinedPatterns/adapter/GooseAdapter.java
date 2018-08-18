package com.dmch.hf.combinedPatterns.adapter;

import com.dmch.hf.combinedPatterns.Quackable;
import com.dmch.hf.combinedPatterns.observable.Observable;
import com.dmch.hf.combinedPatterns.observable.Observer;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class GooseAdapter implements Quackable {
    private Goose goose;
    Observable observable = new Observable(this);

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
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
