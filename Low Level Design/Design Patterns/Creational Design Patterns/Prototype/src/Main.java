import example_one.Rectangle;
import example_one.Shape;
import example_one.Square;

public class Main {
    public static void main(String[] args) {

        Shape square = new Square("10");
        Shape rectangle = new Rectangle("10", "20");

        Shape squareCopy = square.clone();
        Shape rectangleCopy = rectangle.clone();

        System.out.println("Original Square: " + square);
        System.out.println("Cloned Square: " + squareCopy);

        System.out.println("Original Rectangle: " + rectangle);
        System.out.println("Cloned Rectangle: " + rectangleCopy);
    }
}
