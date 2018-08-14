package com.dmch.hf.command.objects;

public class Stereo {
    private static final String CD = "cd";
    private static final String DVD = "dvd";
    private static final String RADIO = "radio";
    private String type;
    private int volume;

    public void printType() {
        System.out.println("Stereo type is: " + type + " , volume is: " + volume);
    }
    public void on() {
        System.out.println("Stereo is on");
    }
    public void off() {
        System.out.println("Stereo is off");
    }
    public void setCD() {
        type = CD;
        printType();
    }
    public void setDVD() {
        type = DVD;
        printType();
    }
    public void setRadio() {
        type = RADIO;
        printType();
    }


    public void setVolume(int volume) {
        this.volume = volume;
    }
}
