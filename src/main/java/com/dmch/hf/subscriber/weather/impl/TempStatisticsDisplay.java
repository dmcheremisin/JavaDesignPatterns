package com.dmch.hf.subscriber.weather.impl;

import com.dmch.hf.subscriber.weather.DisplayElement;
import com.dmch.hf.subscriber.weather.Observer;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class TempStatisticsDisplay implements Observer, DisplayElement {
    private List<Integer> tempValues = new ArrayList<>();
    private WeatherApp app;

    public TempStatisticsDisplay(WeatherApp app) {
        this.app = app;
        this.app.addObserver(this);
    }

    @Override
    public void display() {
        IntSummaryStatistics statistics = tempValues
                .stream()
                .mapToInt(val -> val)
                .summaryStatistics();

        System.out.println("Temperature: [ Min = " + statistics.getMin() +
                " , Avg = " + statistics.getAverage() +
                " , Max = " + statistics.getMax() + " ]"
        );

    }

    @Override
    public void update(int temp, int pressure, int humidity) {
        tempValues.add(temp);
        display();
    }
}
