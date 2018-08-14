package com.dmch.hf.facade.environment;

/**
 * Created by Dmitrii on 15.08.2018.
 */
public class Amplifier {
    public void on() {
        System.out.println("Amplifier is on");
    }
    public void off() {
        System.out.println("Amplifier is off");
    }
    public void setSurroundSound() {
        System.out.println("Surround sound is on");
    }
    public void setVolume(int value) {
        System.out.println("Volume is set to " + value);
    }
}
