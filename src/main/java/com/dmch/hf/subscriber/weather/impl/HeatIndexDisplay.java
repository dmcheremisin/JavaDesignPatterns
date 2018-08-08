package com.dmch.hf.subscriber.weather.impl;

import com.dmch.hf.subscriber.weather.DisplayElement;
import com.dmch.hf.subscriber.weather.Observer;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private WeatherApp app;
    private int temperature;
    private int humidity;
    public static final String RESULT_FORMAT = "#.#";

    public HeatIndexDisplay(WeatherApp app) {
        this.app = app;
        this.app.addObserver(this);
    }

    @Override
    public void display() {
        String heatIndex = calcHeatIndex();
        System.out.println("Heat index: " + heatIndex);
    }

    @Override
    public void update(int temp, int pressure, int humidity) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    private String calcHeatIndex() {
        double Hindex;
        double temp = (temperature * 9/5) + 32; // to fahrenheit

        Hindex = -42.379 + 2.04901523 * temp + 10.14333127 * humidity;
        Hindex = Hindex - 0.22475541 * temp * humidity - 6.83783 * Math.pow(10, -3) * temp * temp;
        Hindex = Hindex - 5.481717 * Math.pow(10, -2) * humidity * humidity;
        Hindex = Hindex + 1.22874 * Math.pow(10, -3) * temp * temp * humidity;
        Hindex = Hindex + 8.5282 * Math.pow(10, -4) * temp * humidity * humidity;
        Hindex = Hindex - 1.99 * Math.pow(10, -6) * temp * temp * humidity * humidity;

        Hindex = (Hindex - 32) / (9/5); // to celsius

        DecimalFormat df = new DecimalFormat(RESULT_FORMAT);
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(Hindex);
    }


}
