package org.glovatskiy.kata.marsrover;

import org.glovatskiy.kata.marsrover.commands.Command;
import org.glovatskiy.kata.marsrover.commands.CommandDispatcher;

import java.util.Scanner;

public class RoverControl {

    public static void main(String[] args) {
        Position initPosition = new Position(args);
        Rover rover = new Rover(initPosition);
        Scanner sc = new Scanner(System.in);
        while (true) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Communication.say("Got command Sequence:" + line + ". Roger");
                String[] commands = line.split("(?!^)");
                for (String stringCommand : commands) {
                    Command command = CommandDispatcher.getCommand(stringCommand);
                    command.executeOnRover(rover);
                }
            }
        }
    }
}
