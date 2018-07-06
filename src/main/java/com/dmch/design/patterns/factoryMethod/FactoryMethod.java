package com.dmch.design.patterns.factoryMethod;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FactoryMethod {
    public static void main(String[] args) {
        WatchMaker watchMaker = getMaker("Classic");
        Watch watch = watchMaker.createWatch();
        watch.showTime();
        // 2018-07-06
    }

    public static WatchMaker getMaker(String name){
        if("Digital".equalsIgnoreCase(name)){
            return new DigitalWatchMaker();
        } else if("Classic".equalsIgnoreCase(name)){
            return new ClassicWatchMaker();
        }
        throw new RuntimeException("No watchmaker match found");
    }
}

interface Watch {
    void showTime();
}
class DigitalWatch implements Watch{
    public void showTime() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
class ClassicWatch implements Watch {
    public void showTime() {
        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
    }
}

interface WatchMaker {
    Watch createWatch();
}
class DigitalWatchMaker implements WatchMaker{
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
class ClassicWatchMaker implements WatchMaker{
    public Watch createWatch() {
        return new ClassicWatch();
    }
}

