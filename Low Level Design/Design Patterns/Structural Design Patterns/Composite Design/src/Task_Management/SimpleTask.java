package Task_Management;

public class SimpleTask implements Task{

    private String title;
    private String priority;

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
        System.out.println("Task Name: " + this.title + " Task Priority: " + this.priority);
        System.out.println("-------------------------------------------");
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
