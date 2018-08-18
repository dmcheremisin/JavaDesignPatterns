package com.dmch.hf.combinedPatterns.adapter;

import com.dmch.hf.combinedPatterns.Quackable;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
