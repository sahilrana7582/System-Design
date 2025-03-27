package File_Example;

public class RealImage implements Image {
    private String filename;


    public RealImage(String filename) {
        this.filename = filename;
    }



    @Override
    public void display() {
        System.out.println("File is Very Heavy. Trying to open...");
        System.out.println("open " + filename);
    }
}
