package pl.danowski.rafal.gitDemo.model;

public class Square extends Shape {
    @Override
    protected String draw() {
        return "SQUARE filled with " + color.fill();
    }
}
