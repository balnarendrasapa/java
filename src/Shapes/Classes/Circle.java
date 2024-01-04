package Shapes.Classes;

import Shapes.Interfaces.Shape;

public class Circle implements Shape {
    private final double radius;

    public String getInfo() {
        return String.format("Radius: %f", this.radius);
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
