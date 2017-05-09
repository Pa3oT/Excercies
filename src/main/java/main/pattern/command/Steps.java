package main.pattern.command;

import java.util.LinkedList;
import java.util.List;

public class Steps {
    public void goSouth() {
        System.out.println("step to south");
    }

    public void goNorth() {
        System.out.println("step to north");
    }

    public void goEast() {
        System.out.println("step to east");
    }

    public void goWest() {
        System.out.println("step to west");
    }
}

abstract class StepsCommand implements Command {
    protected Steps steps = new Steps();
}

interface Command {
    void execute();
}

class GoEastCommand extends StepsCommand {
    @Override
    public void execute() {
        steps.goEast();
    }
}

class GoNorthCommand extends StepsCommand {
    @Override
    public void execute() {
        steps.goNorth();
    }
}

class GoSouthCommand extends StepsCommand {
    @Override
    public void execute() {
        steps.goSouth();
    }
}

class GoWestCommand extends StepsCommand {
    @Override
    public void execute() {
        steps.goWest();
    }
}

class Navigator {
    private final List<StepsCommand> steps = new LinkedList<>();
    private final List<StepsCommand> path = new LinkedList<>();

    public Navigator registerStep(StepsCommand step) {
        steps.add(step);
        return this;
    }

    public void go() {
        for(StepsCommand step : steps) {
            step.execute();
            ((LinkedList)path).addFirst(step);
        }
        steps.clear();
    }

    public void goBack() {
        for(StepsCommand step : path) {
            step.execute();
        }
        path.clear();
    }
}

class Client {
    public static void main(String[] args) {
        Navigator navigator =
                new Navigator().registerStep(new GoEastCommand())
                        .registerStep(new GoNorthCommand())
                        .registerStep(new GoNorthCommand())
                        .registerStep(new GoSouthCommand());
        System.out.println("go");
        navigator.go();
        System.out.println("go back");
        navigator.goBack();
    }
}