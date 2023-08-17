package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        if (givenCommand == Command.MOVE) {
            if (location.getDirection() == Direction.NORTH) {
                location.setY(location.getY() +1);
            } else if (location.getDirection() == Direction.SOUTH) {
                location.setY(location.getY() - 1);
            } else if (location.getDirection() == Direction.EAST) {
                location.setX(location.getX() +1);
            } else {
                location.setX(location.getX() -1);
            }
        } else if (givenCommand == Command.TURN_LEFT) {
            if (location.getDirection() == Direction.NORTH) {
                location.setDirection(Direction.WEST);
            } else if (location.getDirection() == Direction.SOUTH) {
                location.setDirection(Direction.EAST);
            } else if (location.getDirection() == Direction.EAST) {
                location.setDirection(Direction.NORTH);
            }  else if (location.getDirection() == Direction.WEST) {
            location.setDirection(Direction.SOUTH);
            }
        } else if (givenCommand == Command.TURN_RIGHT) {
            if (location.getDirection() == Direction.NORTH) {
                location.setDirection(Direction.EAST);
            } else if (location.getDirection() == Direction.EAST) {
                location.setDirection(Direction.SOUTH);
            } else if (location.getDirection() == Direction.WEST) {
                location.setDirection(Direction.NORTH);
            }else if (location.getDirection() == Direction.SOUTH) {
                location.setDirection(Direction.WEST);
            }
        }
    }

    public void executeBatchCommands(List<Command> commands) {
        commands.forEach(this::executeCommand);
    }

    public Location getCurrentLocation() {
        return location;
    }
}
