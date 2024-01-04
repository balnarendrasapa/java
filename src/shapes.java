import Shapes.Classes.Circle;
import Shapes.Classes.Rectangle;
import Shapes.Interfaces.Shape;
import Shapes.Classes.Square;

public class shapes {
    private static void printArea(Shape s) {
        System.out.println("Area: " + s.getArea());
    }
    private static void printPerimeter(Shape s) {
        System.out.println("Perimeter: " + s.getPerimeter());
    }
    public static void main(String[] args) {
        Circle s = new Circle(15);
        Rectangle r = new Rectangle(5, 10);
        Square sq = new Square(5);

        System.out.println("Circle: ");
        System.out.println("Radius = " + s.getRadius());
        printArea(s);
        printPerimeter(s);
        System.out.println();

        System.out.println("Rectangle: ");
        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
        printArea(r);
        printPerimeter(r);
        System.out.println();

        System.out.println("Squares: ");
        System.out.println("Side Length: " + sq.getLength());
        printArea(sq);
        printPerimeter(sq);
    }
}
