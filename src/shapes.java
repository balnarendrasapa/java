import Shapes.Classes.Circle;
import Shapes.Classes.Rectangle;
import Shapes.Classes.RightTriangle;
import Shapes.Interfaces.Shape;
import Shapes.Classes.Square;

public class shapes {
    private static void printDetails(Shape s) {
        System.out.println(s.getInfo());
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println();
    }
    public static void main(String[] args) {
        Circle s = new Circle(15);
        Rectangle r = new Rectangle(5, 10);
        Square sq = new Square(5);
        RightTriangle rt = new RightTriangle(3, 4);

        System.out.println("Circle: ");
        printDetails(s);

        System.out.println("Rectangle: ");
        printDetails(r);

        System.out.println("Squares: ");
        printDetails(sq);

        System.out.println("Right Triangle: ");
        printDetails(rt);
    }
}
