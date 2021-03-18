package pl.danowski.rafal.gitDemo.model;

public class Rectangle extends Shape {
    @Override
    protected String draw() {
        return "RECTANGLE filled with " + color.fill();
    }
}
