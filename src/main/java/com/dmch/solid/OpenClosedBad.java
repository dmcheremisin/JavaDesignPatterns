package com.dmch.solid;

public class OpenClosedBad {
    public static void main(String[] args) {
        Celica celica = new Celica();
        workInTaxi(celica);
    }

    /**
     * This method represents bad practice, because:
     * everytime we will make new car, we will have to change workInTaxi method
     * we will need to apply more, and more conditional statements in order to call proper method
     * @param toyota
     */
    static void workInTaxi(Toyota toyota){
        if(toyota instanceof Celica){
            toyota.getOnePassanger();
        } else {
            toyota.getPassanges();
        }
    }

    private static class Toyota {
        void getPassanges(){
            System.out.println("Getting passangers");
        }
        void getOnePassanger(){
            System.out.println("Getting one passanger");
        }
    }
    private static class Celica extends Toyota {
    }
}

