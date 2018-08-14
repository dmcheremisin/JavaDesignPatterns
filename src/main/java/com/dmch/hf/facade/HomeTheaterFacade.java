package com.dmch.hf.facade;

import com.dmch.hf.facade.environment.Amplifier;
import com.dmch.hf.facade.environment.DVD;
import com.dmch.hf.facade.environment.Projector;
import com.dmch.hf.facade.environment.Screen;

/**
 * Created by Dmitrii on 15.08.2018.
 */
public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVD dvd;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade(Amplifier amplifier, DVD dvd, Projector projector, Screen screen) {
        this.amplifier = amplifier;
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        amplifier.on();
        amplifier.setSurroundSound();
        amplifier.setVolume(10);
        dvd.on();
        projector.on();
        projector.wideScreenModeOn();
        screen.down();
        dvd.play(movie);
    }

    public void endMovie() {
        amplifier.off();
        dvd.off();
        projector.off();
        screen.up();
    }
}
