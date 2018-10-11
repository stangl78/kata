package org.glovatskiy.kata.marsrover.commands;

import org.glovatskiy.kata.marsrover.Communication;
import org.glovatskiy.kata.marsrover.Position;
import org.glovatskiy.kata.marsrover.Rover;

public abstract class AbstractMoveCommand implements Command {


    @Override
    public void executeOnRover(Rover rover) {
        Position position = rover.getPosition();
        Communication.say("Try to move forward");
        Position newPosition = calculateNewPosition(position);
        Communication.say("Moving to position x="+newPosition.getX()+
                " y="+newPosition.getY()+
                " direction="+newPosition.getDirection().name()+" ");
        rover.moveTo(newPosition);
    }

    protected abstract Position calculateNewPosition(Position position) ;
}
