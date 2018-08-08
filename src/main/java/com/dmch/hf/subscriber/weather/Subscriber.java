package com.dmch.hf.subscriber.weather;

public interface Subscriber {
    void addObserver(Observer observer);
    boolean removeObserver(Observer observer);
    void notifyObservers();
}
