package org.glovatskiy.kata.marsrover;

public class Rover {

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    Position position;

    public Rover(Position position) {
        this.position = position;
    }

    public void moveTo(Position position){
        this.position = position;
    }

    public void quit() {
        throw new RuntimeException("I have to leave, may the force be with you...");
    }
}
