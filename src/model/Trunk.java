package model;

public class Trunk {
    private final double height;

    public Trunk() {
        this.height = 1.0; // startowa wysokość
    }

    public String getDescription() {
        return "Wysokość: " + height + " m";
    }
}