package io.codelex.enums.practice;

import java.util.Scanner;

public enum CardinalPoints {
    NORTH("North", "up"),
    SOUTH("South", "down"),
    EAST("East", "right"),
    WEST("West", "left");

    private final String direction;
    private final String text;

    CardinalPoints(String direction, String text) {
        this.direction = direction;
        this.text = text;
    }

    public String getDirection() {
        return direction;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return direction + ":" + text + ":" + ordinal();
    }
}
