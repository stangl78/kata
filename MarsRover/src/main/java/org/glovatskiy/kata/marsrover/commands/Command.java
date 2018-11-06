package org.glovatskiy.kata.marsrover.commands;

import org.glovatskiy.kata.marsrover.Rover;

public interface Command {

    public void executeOnRover(Rover rover);
}
