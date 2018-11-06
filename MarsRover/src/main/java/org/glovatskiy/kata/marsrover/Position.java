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
        if (args == null){
            this.x = 0;
            this.y = 0;
            this.direction = Direction.N;
        } else {
            this.x = args[0] == null ? 0 : Integer.parseInt(args[0]);
            this.y = args[1] == null ? 0 : Integer.parseInt(args[1]);
            this.direction = Direction.valueOf(String.valueOf(args[2]).trim());
        }

    }

    public Position(Position newPosition) {
        this.x = newPosition.x;
        this.y = newPosition.y;
        this.direction = newPosition.direction;

    }

}
