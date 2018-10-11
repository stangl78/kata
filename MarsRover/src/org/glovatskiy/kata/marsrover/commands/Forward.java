package org.glovatskiy.kata.marsrover.commands;

import org.glovatskiy.kata.marsrover.Communication;
import org.glovatskiy.kata.marsrover.Direction;
import org.glovatskiy.kata.marsrover.Position;
import org.glovatskiy.kata.marsrover.Rover;

import static org.glovatskiy.kata.marsrover.Direction.*;

public class Forward extends AbstractMoveCommand {

    protected Position calculateNewPosition(Position position) {
        Position newPosition = new Position(position);
        switch (position.getDirection()){
            case N: newPosition.setY(position.getY()+1); break;
            case S: newPosition.setY(position.getY()-1); break;
            case E: newPosition.setX(position.getX()+1); break;
            case W: newPosition.setX(position.getX()-1); break;
            default:
        }
        return newPosition;
    }
}
