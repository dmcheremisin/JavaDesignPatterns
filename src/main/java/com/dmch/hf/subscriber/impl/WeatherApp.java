package com.dmch.hf.subscriber.impl;

import com.dmch.hf.subscriber.Observer;
import com.dmch.hf.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class WeatherApp implements Subscriber {
    private List<Observer> observers = new ArrayList<Observer>();
    private int temperature;
    private int pressure;
    private int humidity;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temperature, pressure, humidity));
    }

    public void measurementsChanged(int temp, int pressure, int humidity){
        this.temperature = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }
}
