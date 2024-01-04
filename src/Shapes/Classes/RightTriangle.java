package Shapes.Classes;

import Shapes.Interfaces.Shape;

public class RightTriangle implements Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public RightTriangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    public String getInfo() {
        return String.format("Side A: %f\nSide B: %f\nSide C: %f", this.sideA, this.sideB, this.sideC);
    }
    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double getArea() {
        return (this.sideA * this.sideB) / 2;
    }

    @Override
    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
}
