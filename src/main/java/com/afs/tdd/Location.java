package com.afs.tdd;

public class Location {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    private int x;
    private int y;
    private Direction direction;

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}