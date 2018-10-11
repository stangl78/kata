package org.glovatskiy.kata.marsrover.commands;

import org.glovatskiy.kata.marsrover.Position;

public class Backward extends AbstractMoveCommand {

    protected Position calculateNewPosition(Position position) {
        Position newPosition = new Position(position);
        switch (position.getDirection()) {
            case N:
                newPosition.setY(position.getY() - 1);
                break;
            case S:
                newPosition.setY(position.getY() + 1);
                break;
            case E:
                newPosition.setX(position.getX() - 1);
                break;
            case W:
                newPosition.setX(position.getX() + 1);
                break;
            default:
        }
        return newPosition;
    }
}
