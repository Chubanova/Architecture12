package ru.chubanova.comm;

import ru.chubanova.adapt.Movable;

import java.util.Vector;

public class Move implements Command {

    private final Movable movable;

    public Move(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void execute() {
        Vector<Integer> currentPosition = movable.getPosition();
        Vector<Double> actualVelocity = movable.getVelocity();
        Vector<Integer> newPosition = new Vector<>();
        for (int i = 0; i < currentPosition.size(); i++) {
            newPosition.add((int) (currentPosition.get(i) + actualVelocity.get(i)));
        }
        movable.setPosition(newPosition);
    }
}
