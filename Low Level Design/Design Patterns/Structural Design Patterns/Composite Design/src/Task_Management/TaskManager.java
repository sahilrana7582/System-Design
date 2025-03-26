package Task_Management;

import java.util.ArrayList;
import java.util.List;

public class TaskManager implements Task{

    private String title;
    private List<Task> taskList = new ArrayList<>();



    public void addTask(Task task) {
        taskList.add(task);
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Task Name: " + this.title);
        System.out.println("Task To Complete: ");
        for(Task task : taskList){
            task.display();
        }
    }

}
