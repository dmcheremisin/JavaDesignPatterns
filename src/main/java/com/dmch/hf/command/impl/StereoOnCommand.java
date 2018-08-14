package com.dmch.hf.command.impl;

import com.dmch.hf.command.Command;
import com.dmch.hf.command.objects.Stereo;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setVolume(11);
        stereo.setCD();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
