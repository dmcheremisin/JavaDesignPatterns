package com.dmch.hf.command;

import com.dmch.hf.command.impl.*;
import com.dmch.hf.command.objects.CeilingFan;
import com.dmch.hf.command.objects.GarageDoor;
import com.dmch.hf.command.objects.Light;
import com.dmch.hf.command.objects.Stereo;

public class CommandApp {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        Stereo stereo = new Stereo();
        Command stereoOnCommand = new StereoOnCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);

        CeilingFan ceilingFan = new CeilingFan();
        Command ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(3, ceilingFanOnCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.undo();
        remoteControl.onButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.undo();
        
        remoteControl.offButtonWasPressed(0);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undo();
        remoteControl.offButtonWasPressed(2);
        remoteControl.offButtonWasPressed(3);

//        Light is on
//        Light is off
//        Door is up
//        Stereo is on
//        Stereo type is: cd , volume is: 11
//        Fan speed is: 10
//        Light is off
//        Door is down
//        Door is up
//        Stereo is off
        
        
    }
}
