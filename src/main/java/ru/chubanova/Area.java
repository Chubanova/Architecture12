package ru.chubanova;

import lombok.Data;
import ru.chubanova.adapt.AreaMoveable;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

@Data
public class Area {

    private Vector<Integer> coords;

    private List<AreaMoveable> objects = new LinkedList<>();
}
