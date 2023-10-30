package ru.chubanova.comm;


import ru.chubanova.adapt.Rotatable;

public class Rotate implements Command {

    private final Rotatable rotatable;

    public Rotate(Rotatable rotatable) {
        this.rotatable = rotatable;
    }

    @Override
    public void execute() {
        rotatable.getDirection().next(rotatable.getAngularVelocity());
    }
}
