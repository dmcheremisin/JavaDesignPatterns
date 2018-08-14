package com.dmch.hf.command.impl;

import com.dmch.hf.command.Command;
import com.dmch.hf.command.objects.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setVolume(11);
        stereo.setCD();
    }
}
