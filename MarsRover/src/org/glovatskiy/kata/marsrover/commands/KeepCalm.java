package org.glovatskiy.kata.marsrover.commands;

import org.glovatskiy.kata.marsrover.Communication;
import org.glovatskiy.kata.marsrover.Rover;

public class KeepCalm implements Command {


    @Override
    public void executeOnRover(Rover rover) {
        Communication.say("Oh my Dear... I do not know what to do. So i pretend nothing happened.");
        Communication.say("Keeping Calm on position x="+rover.getPosition().getX()+
                " y="+rover.getPosition().getY()+
                " direction="+rover.getPosition().getDirection().name()+" ");

    }
}
