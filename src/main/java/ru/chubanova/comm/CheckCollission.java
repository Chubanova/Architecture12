package ru.chubanova.comm;

import lombok.RequiredArgsConstructor;
import ru.chubanova.adapt.AreaMoveable;

@RequiredArgsConstructor
public class CheckCollission implements Command {

    private final AreaMoveable firstObject;
    private final AreaMoveable secondObject;

    @Override
    public void execute() {
        //here logic to check collissions
    }
}
