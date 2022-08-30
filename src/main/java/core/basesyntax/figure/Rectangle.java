package core.basesyntax.figure;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle (String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}