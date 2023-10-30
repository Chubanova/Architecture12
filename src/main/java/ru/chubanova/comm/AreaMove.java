package ru.chubanova.comm;

import lombok.RequiredArgsConstructor;
import ru.chubanova.*;
import ru.chubanova.adapt.AreaMoveable;


import java.util.List;
import java.util.Queue;
import java.util.Vector;

@RequiredArgsConstructor
public class AreaMove implements Command {

    private final AreaMoveable areaMoveable;
    private final IoC ioC;

    @Override
    public void execute() {
        areaMoveable.getPosition();
        Area currentArea = areaMoveable.getArea();
        Vector<Integer> currentPosition = areaMoveable.getPosition();
        Vector<Double> actualVelocity = areaMoveable.getVelocity();
        Vector<Integer> newPosition = new Vector<>();
        for (int i = 0; i < currentPosition.size(); i++) {
            newPosition.add((int) (currentPosition.get(i) + actualVelocity.get(i)));
        }
        Area newArea = (Area) ioC.resolve("Area.Get", newPosition);
        Queue<Command> commands = (Queue<Command>) ioC.resolve("Commands");
        List<AreaMoveable> objects = newArea.getObjects();
        if(newArea != currentArea) {
            currentArea.getObjects().remove(areaMoveable);
            newArea.getObjects().add(areaMoveable);
            areaMoveable.setArea(newArea);
        }
        objects.forEach(object -> commands.add(new CheckCollission(areaMoveable, object)));
        areaMoveable.setPosition(newPosition);
    }
}
