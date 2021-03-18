package pl.danowski.rafal.gitDemo.model;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "SQUARE filled with " + color.fill();
    }
}
