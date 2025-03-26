package Directory_Example;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component{
    private String name;
    private int size;
    private List<Component> files;


    public Directory(String name){
        this.name = name;
        this.size = 0;
        this.files = new ArrayList<>();
    }

    public void add(Component file){
        files.add(file);
        size += file.getSize();
    }


    @Override
    public void open() {
        System.out.println("The Directory " + name + " is opening...");
        System.out.println("Directory Size: " + size);

        for(Component component : files){
            component.open();
            System.out.println("File Size: " + component.getSize());
        }
    }

    @Override
    public void close() {
        System.out.println("The " + name + " is closing...");
    }

    @Override
    public int getSize() {
        return size;
    }
}
