package com.dmch.hf.command.objects;

public class CeilingFan {
    private static final int HIGH = 15;
    private static final int MEDIUM = 10;
    private static final int LOW = 5;
    private int speed;

    public void high() {
        speed = HIGH;
        printSpeed();
    }

    public void medium() {
        speed = MEDIUM;
        printSpeed();
    }

    public void low() {
        speed = LOW;
        printSpeed();
    }

    public void off() {
        speed = 0;
        printSpeed();
    }

    public int getSpeed() {
        return speed;
    }

    public void printSpeed() {
        if (speed > 0) {
            System.out.println("Fan speed is: " + speed);
        } else {
            System.out.println("Fan is off");
        }
    }
}
