import example_one.Forest;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Forest forest = new Forest();


        forest.plantTree(10, 20, 5, "Oak", "Green", "Rough");
        forest.plantTree(15, 25, 5, "Oak", "Green", "Rough");
        forest.plantTree(20, 30, 8, "Pine", "Dark Green", "Smooth");
        forest.plantTree(25, 35, 8, "Pine", "Dark Green", "Smooth");
        forest.plantTree(30, 40, 10, "Birch", "Light Green", "Striped");

        forest.draw();

    }
}