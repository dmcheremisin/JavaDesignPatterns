package com.dmch.hf.combinedPatterns.observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class Observable implements  QuackObservable{
    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer next = iterator.next();
            next.update(duck);
        }
    }
}
