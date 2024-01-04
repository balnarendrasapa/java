package Shapes.Classes;

import Shapes.Interfaces.Shape;

public class Rectangle implements Shape {
    private final double length;
    private final double width;

    @Override
    public String getInfo() {
        return String.format("Length: %f\nWidth: %f", this.length, this.width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }

}
