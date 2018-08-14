package com.dmch.hf.command;

public interface Command {
    void execute();
    void undo();
}
