package example_one;

public class Tree {
    private int x;
    private int y;
    private int size;
    private TreeType treeType;

    public Tree(int x, int y, int size, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.treeType = treeType;
    }

    public void draw(){
        treeType.draw(x, y, size);
    }

}
