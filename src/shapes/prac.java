package shapes;

class Circle implements Shape {
    private final double radius;
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

class Rectangle implements Shape {
    private final double length;
    private final double width;
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

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class prac {
    private static void printArea(Shape s) {
        System.out.println(s.getArea());
    }
    private static void printPerimeter(Shape s) {
        System.out.println(s.getPerimeter());
    }
    public static void main(String[] args) {
        Shape s = new Circle(5);
        Shape r = new Rectangle(5, 10);
        Shape sq = new Square(5);
        printArea(s);
        printArea(r);
        printArea(sq);
        printPerimeter(s);
        printPerimeter(r);
        printPerimeter(sq);
    }
}
