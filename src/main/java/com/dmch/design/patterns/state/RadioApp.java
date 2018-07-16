package com.dmch.design.patterns.state;

public class RadioApp {
    public static void main(String[] args) {
        RadioReceiver receiver = new RadioReceiver();
        receiver.setRadio(new RadioEnergy());
        receiver.nextStation();
        receiver.nextStation();
        receiver.nextStation();
//        Radio Energy is playing...
//        Radio DFM is playing...
//        Radio Record is playing...
//        Radio Energy is playing...
    }
}

// State
interface Radio{
    void play();
}
class RadioEnergy implements Radio {
    public void play() {
        System.out.println("Radio Energy is playing...");
    }
}
class RadioDFM implements Radio {
    public void play() {
        System.out.println("Radio DFM is playing...");
    }
}
class RadioRecord implements Radio {
    public void play() {
        System.out.println("Radio Record is playing...");
    }
}
// Context
class RadioReceiver{
    private Radio radio;
    public void setRadio(Radio radio) {
        this.radio = radio;
        radio.play();
    }
    public void nextStation(){
        if(radio instanceof RadioEnergy){
            radio = new RadioDFM();
        } else if(radio instanceof RadioDFM){
            radio = new RadioRecord();
        } else {
            radio = new RadioEnergy();
        }
        radio.play();
    }
}