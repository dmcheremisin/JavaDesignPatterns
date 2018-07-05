package com.dmch.design.patterns.facade;

public class FacadeApp {
    public static void main(String[] args) {
//        Power power = new Power();
//        DvdRom dvdRom = new DvdRom();
//        HDD hdd = new HDD();
//        power.turnPowerOn();
//        dvdRom.load();
//        hdd.copy(dvdRom);
        ComputerFacade facade = new ComputerFacade();
        facade.copy();
    }
}

class ComputerFacade{
    Power power = new Power();
    DvdRom dvdRom = new DvdRom();
    HDD hdd = new HDD();

    void copy(){
        power.turnPowerOn();
        dvdRom.load();
        hdd.copy(dvdRom);
    }
}
class Power{
    public void turnPowerOn(){
        System.out.println("Power is ON");
    }
    public void turnPowerOff(){
        System.out.println("Power is Off");
    }
}
class DvdRom{
    private boolean loaded;
    public boolean isLoaded(){
        return loaded;
    }
    public void load(){
        loaded = true;
        System.out.println("DVDRom is loaded");
    }
    public void unload(){
        loaded = false;
        System.out.println("DVDRom is unloaded");
    }
}
class HDD{
    public void copy(DvdRom dvdRom){
        if(dvdRom.isLoaded()){
            dvdRom.load();
        } else {
            System.out.println("Please, load DVDRom");
        }
    }
}
