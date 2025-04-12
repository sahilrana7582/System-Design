package example_one;

public class TreeType {

    private String name;
    private String texture;
    private String color;

    public TreeType(String name, String texture, String color) {
        this.name = name;
        this.texture = texture;
        this.color = color;
    }

    public void draw(int x, int y, int size){
        System.out.println("Drawing a " + name + " tree of color " + color +
                " with texture [" + texture + "] at (" + x + ", " + y +
                ") with size " + size);
    }
}
