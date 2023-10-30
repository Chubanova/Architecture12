package ru.chubanova.adapt;

import ru.chubanova.Direction;

public interface Rotatable {

    Direction getDirection();

    int getAngularVelocity();

    void setDirection(Direction newDirection);

}
