package com.dmch.hf.facade;

import com.dmch.hf.facade.environment.Amplifier;
import com.dmch.hf.facade.environment.DVD;
import com.dmch.hf.facade.environment.Projector;
import com.dmch.hf.facade.environment.Screen;

/**
 * Created by Dmitrii on 15.08.2018.
 */
public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade(new Amplifier(), new DVD(), new Projector(), new Screen());
        facade.watchMovie("Top Gun");
        System.out.println();
        facade.endMovie();

//        Amplifier is on
//        Surround sound is on
//        Volume is set to 10
//        DVD is on
//        Projector is on
//        Wide screen mode is on
//        Screen is down
//        DVD is playing movie: Top Gun
//
//        Amplifier is off
//        DVD is off
//        Projector is off
//        Screen is up
    }
}
