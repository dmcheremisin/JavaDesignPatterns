package com.dmch.hf.facade.environment;

/**
 * Created by Dmitrii on 15.08.2018.
 */
public class DVD {
    public void on() {
        System.out.println("DVD is on");
    }
    public void off() {
        System.out.println("DVD is off");
    }

    public void play(String movie) {
        System.out.println("DVD is playing movie: " + movie);
    }
}
