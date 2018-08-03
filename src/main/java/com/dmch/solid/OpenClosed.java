package com.dmch.solid;

public class OpenClosed {
    public static void main(String[] args) {
        Celica celica = new Celica();
        workInTaxi(celica);
    }

    /**
     * Now all our logic is <<closed>> in concrete class: Toyota or Celica
     * But by implementing Car interface our code is <<open>> for changes
     * Main class knows only about interface
     *
     * @param car
     */
    static void workInTaxi(Car car){
        car.workInTaxi();
    }
}
interface Car{
    void workInTaxi();
}
class Toyota implements Car {
    public void workInTaxi() {
        getPassanges();
    }
    private void getPassanges(){
        System.out.println("Getting passangers");
    }
}
class Celica extends Toyota {
    public void workInTaxi() {
        getOnePassanger();
    }
    private void getOnePassanger(){
        System.out.println("Getting one passanger");
    }
}