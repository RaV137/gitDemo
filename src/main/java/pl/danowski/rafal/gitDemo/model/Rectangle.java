package pl.danowski.rafal.gitDemo.model;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "RECTANGLE filled with " + color.fill();
    }
}
