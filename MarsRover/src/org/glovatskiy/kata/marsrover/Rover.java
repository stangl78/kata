package org.glovatskiy.kata.marsrover;

public class Rover {

    Position position;

    public Position getPosition() {
        return position;
    }

    public Rover(Position position) {
        this.position = position;
    }

    public void moveTo(Position position) {
        this.position = position;
    }

    public void quit() {
        throw new RuntimeException("I have to leave, may the force be with you...");
    }
}
