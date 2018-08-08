package com.dmch.hf.subscriber;

public interface Subscriber {
    void addObserver(Observer observer);
    boolean removeObserver(Observer observer);
    void notifyObservers();
}
