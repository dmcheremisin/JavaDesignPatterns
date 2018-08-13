package com.dmch.design.patterns.singleton;

public class SingletonApp {
    public static final int SIZE = 100;

    public static void main(String[] args) throws InterruptedException {
        testSingleton(Singleton::getInstance);
        testSingleton(SingletonThreadSafe::getInstance);

        System.out.println(Singleton.counter);
        System.out.println(SingletonThreadSafe.counter);
    }

    private static void testSingleton(Runnable runnable) throws InterruptedException {
        Thread[] threads = new Thread[SIZE];
        for(int i = 0; i < SIZE; i++){
            threads[i] = new Thread(runnable);
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
    }
}

class Singleton {
    public static int counter = 0;
    private static Singleton instance;

    private Singleton() {
        counter++;
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonThreadSafe {
    public static int counter = 0;
    private static SingletonThreadSafe instance;
    private static Object mutex = new Object();

    private SingletonThreadSafe(){
        counter++;
    }

    public static SingletonThreadSafe getInstance() {
        // template double-checked locking
        if(instance == null){
            synchronized (mutex){
                if(instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
