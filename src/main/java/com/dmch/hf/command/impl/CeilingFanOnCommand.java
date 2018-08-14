package com.dmch.hf.command.impl;

import com.dmch.hf.command.Command;
import com.dmch.hf.command.objects.CeilingFan;

public class CeilingFanOnCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
