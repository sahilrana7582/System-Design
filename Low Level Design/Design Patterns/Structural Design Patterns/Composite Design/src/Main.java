import Directory_Example.Directory;
import Directory_Example.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File pdfFile = new File("PDF File", 100);
        File wordFile = new File("Word File", 100);
        File imageFile = new File("Image File", 200);

        Directory rootDir = new Directory("Root Directory");

        rootDir.add(pdfFile);
        rootDir.add(wordFile);
        rootDir.add(imageFile);

        rootDir.open();
    }
}