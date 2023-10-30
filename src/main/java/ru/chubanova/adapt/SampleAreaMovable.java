package ru.chubanova.adapt;

import ru.chubanova.Area;
import ru.chubanova.adapt.AreaMoveable;

import java.util.Vector;

public class SampleAreaMovable implements AreaMoveable {
    @Override
    public Vector<Integer> getPosition() {
        return null;
    }

    @Override
    public void setPosition(Vector<Integer> newPosition) {

    }

    @Override
    public Vector<Double> getVelocity() {
        return null;
    }

    @Override
    public Area getArea() {
        return null;
    }

    @Override
    public void setArea(Area area) {

    }
}
