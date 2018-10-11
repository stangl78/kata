package org.glovatskiy.kata.marsrover.commands;

import org.glovatskiy.kata.marsrover.Communication;

public class CommandDispatcher {

    public static Command getCommand(String command) {
        Communication.say("Got string command:" + command);
        switch (command) {
            case "f":
                return new Forward();
            case "b":
                return new Backward();
            case "r":
                return new TurnRight();
            case "l":
                return new TurnLeft();
            case "q":
                return new Quit();
            default:
                return new KeepCalm();

        }
    }
}
