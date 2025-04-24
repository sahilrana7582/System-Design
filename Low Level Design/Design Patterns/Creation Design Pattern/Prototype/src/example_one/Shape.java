package example_one;

public abstract class Shape implements Prototype<Shape> {
    protected String length;
    protected String width;

    protected Shape(String length, String width) {
        this.length = length;
        this.width = width;
    }

    protected Shape(Shape shape) {
        this.length = shape.length;
        this.width = shape.width;
    }

    @Override
    public abstract Shape clone();

    @Override
    public String toString() {
        return "Shape [length=" + length + ", width=" + width + "]";
    }
}
