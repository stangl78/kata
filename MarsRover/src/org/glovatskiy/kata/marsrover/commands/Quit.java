package org.glovatskiy.kata.marsrover.commands;

import org.glovatskiy.kata.marsrover.Rover;

public class Quit implements Command {

    @Override
    public void executeOnRover(Rover rover) {
        rover.quit();
    }
}
