package com.dmch.hf.singleton;

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