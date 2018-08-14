package com.dmch.hf.command;

public class RemoteControl {
    private final int SLOT_SIZE = 4;
    Command[] onCommands = new Command[SLOT_SIZE];
    Command[] offCommands = new Command[SLOT_SIZE];
    Command lastCommand;

    private void checkSlot(int slot) {
        if(slot >= SLOT_SIZE) {
            throw new IllegalArgumentException("Slot value is more than remote control size: " + SLOT_SIZE);
        }
    }

    public void setCommand(int slot, Command commandOn, Command commandOff) {
        checkSlot(slot);
        onCommands[slot] = commandOn;
        offCommands[slot] = commandOff;
    }

    public void onButtonWasPressed(int slot) {
        checkSlot(slot);
        Command command = onCommands[slot];
        command.execute();
        lastCommand = command;
    }

    public void offButtonWasPressed(int slot) {
        checkSlot(slot);
        Command command = offCommands[slot];
        command.execute();
        lastCommand = command;
    }

    public void undo() {
        lastCommand.undo();
    }
}
