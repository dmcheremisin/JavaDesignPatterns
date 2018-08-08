package com.dmch.hf.subscriber.impl;

import com.dmch.hf.subscriber.DisplayElement;
import com.dmch.hf.subscriber.Observer;

public class ConditionsDisplay implements Observer, DisplayElement {
    private WeatherApp app;
    private int temperature;
    private int pressure;
    private int humidity;

    public ConditionsDisplay(WeatherApp app) {
        this.app = app;
        app.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temperature + " C, pressure: " + pressure + " mm, humidity: " + humidity + "%");
    }

    @Override
    public void update(int temp, int pressure, int humidity) {
        this.temperature = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
