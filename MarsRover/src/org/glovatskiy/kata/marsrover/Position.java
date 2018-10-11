package org.glovatskiy.kata.marsrover;

public class Position {
    Integer x;
    Integer y;
    Direction direction;


    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


    public Position(String[] args) {

        this.x = args == null ? 0 : args[0] == null ? 0 : Integer.parseInt(args[0]);
        this.y = args == null ? 0 : args[1] == null ? 0 : Integer.parseInt(args[1]);

        this.direction = Direction.valueOf(String.valueOf(args[2]).trim());
    }

    public Position(Position newPosition) {
        this.x = newPosition.x;
        this.y = newPosition.y;
        this.direction = newPosition.direction;

    }

    public Position(Integer x, Integer y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
