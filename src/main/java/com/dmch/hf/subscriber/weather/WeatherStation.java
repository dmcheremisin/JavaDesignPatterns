package com.dmch.hf.subscriber.weather;

import com.dmch.hf.subscriber.weather.impl.ConditionsDisplay;
import com.dmch.hf.subscriber.weather.impl.HeatIndexDisplay;
import com.dmch.hf.subscriber.weather.impl.TempStatisticsDisplay;
import com.dmch.hf.subscriber.weather.impl.WeatherApp;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherApp weatherApp = new WeatherApp();
        ConditionsDisplay conditionsDisplay = new ConditionsDisplay(weatherApp);
        TempStatisticsDisplay tempStatisticsDisplay = new TempStatisticsDisplay(weatherApp);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherApp);

        weatherApp.measurementsChanged(25, 765, 70);
        weatherApp.measurementsChanged(20, 755, 80);
        weatherApp.measurementsChanged(15, 760, 75);

        /*
        Temperature: 25 C, pressure: 765 mm, humidity: 70%
        Temperature: [ Min = 25 , Avg = 25.0 , Max = 25 ]
        Heat index: 46,8
        Temperature: 20 C, pressure: 755 mm, humidity: 80%
        Temperature: [ Min = 20 , Avg = 22.5 , Max = 25 ]
        Heat index: 38,1
        Temperature: 15 C, pressure: 760 mm, humidity: 75%
        Temperature: [ Min = 15 , Avg = 20.0 , Max = 25 ]
        Heat index: 45,4
         */
    }
}
