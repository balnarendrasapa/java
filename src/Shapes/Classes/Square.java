package Shapes.Classes;

public class Square extends Rectangle {

    @Override
    public String getInfo() {
       return String.format("Side: %f", this.getLength());
    }

    public Square(double side) {
        super(side, side);
    }
}
