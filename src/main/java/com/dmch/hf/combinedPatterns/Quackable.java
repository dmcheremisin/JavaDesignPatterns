package com.dmch.hf.combinedPatterns;

import com.dmch.hf.combinedPatterns.observable.QuackObservable;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public interface Quackable extends QuackObservable {
    void quack();
}
