package com.dmch.hf.combinedPatterns.observable;

import com.dmch.hf.combinedPatterns.Quackable;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
