package org.glovatskiy.kata.marsrover.commands;

import org.glovatskiy.kata.marsrover.Direction;
import org.glovatskiy.kata.marsrover.Position;

public class TurnRight extends AbstractMoveCommand {

    protected Position calculateNewPosition(Position position) {
        Position newPosition = new Position(position);
        switch (position.getDirection()) {
            case N:
                newPosition.setDirection(Direction.E);
                break;
            case E:
                newPosition.setDirection(Direction.S);
                break;
            case S:
                newPosition.setDirection(Direction.W);
                break;
            case W:
                newPosition.setDirection(Direction.N);
                break;
        }
        return newPosition;
    }
}
