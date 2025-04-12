package example_one;

public class Square extends Shape {

    public Square(String side) {
        super(side, side);
    }

    public Square(Square square) {
        super(square);
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }

    @Override
    public String toString() {
        return "Square [side=" + length + "]";
    }
}
