package com.dmch.hf.command.impl;

import com.dmch.hf.command.Command;
import com.dmch.hf.command.objects.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
