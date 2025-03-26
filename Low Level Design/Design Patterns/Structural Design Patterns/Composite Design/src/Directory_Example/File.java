package Directory_Example;

public class File implements Component {

    private String name;
    private int size;


    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public void open() {
        String msg = String.format("The File %s is Opening...", name);
        System.out.println(msg);
    }

    @Override
    public void close() {
        String msg = String.format("The File %s is Closing...", name);

    }

    @Override
    public int getSize() {
        return size;
    }
}
