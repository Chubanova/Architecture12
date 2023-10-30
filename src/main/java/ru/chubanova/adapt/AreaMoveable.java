package ru.chubanova.adapt;

import ru.chubanova.Area;

import java.util.Vector;

public interface AreaMoveable {

    Vector<Integer> getPosition();

    void setPosition(Vector<Integer> newPosition);

    Vector<Double> getVelocity();

    Area getArea();

    void setArea(Area area);
}