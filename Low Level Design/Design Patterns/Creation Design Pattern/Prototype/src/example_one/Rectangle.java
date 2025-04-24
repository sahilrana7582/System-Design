package example_one;

public class Rectangle extends Shape {

    public Rectangle(String length, String width) {
        super(length, width);
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
