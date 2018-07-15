package com.dmch.design.patterns.publisherSubscriber;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static com.dmch.design.patterns.publisherSubscriber.MeteoApp.DIR;

/**
 * Created by Dmitrii on 12.07.2018.
 */
public class MeteoApp {
    public static String DIR = "src\\main\\resources\\";
    public static void main(String[] args) {
        ConsoleObserver consoleObserver = new ConsoleObserver();
        FileObserver fileObserver = new FileObserver();
        MeteoStation meteoStation = new MeteoStation();
        meteoStation.addObserver(consoleObserver);
        meteoStation.setData(25, 765);
        meteoStation.addObserver(fileObserver);
        meteoStation.setData(15, 759);
    }
}

interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
interface Observer {
    void handleEvent(int temp, int pressure);
}
class MeteoStation implements Observed{
    int temperature;
    int pressure;
    List<Observer> observers = new ArrayList<>();

    public void setData(int temperature, int pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        observers.forEach(o -> o.handleEvent(temperature, pressure));
    }
}
class ConsoleObserver implements Observer {
    public void handleEvent(int temp, int pressure) {
        System.out.println("Console observer[temp: " + temp + ", pressure:" + pressure + "]");
    }
}
class FileObserver implements Observer {
    public void handleEvent(int temp, int pressure) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
        String dt = LocalDateTime.now().format(pattern);
        File file = new File(DIR + dt + ".txt");
        String s = "Console observer[temp: " + temp + ", pressure:" + pressure + "]";
        try(FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
