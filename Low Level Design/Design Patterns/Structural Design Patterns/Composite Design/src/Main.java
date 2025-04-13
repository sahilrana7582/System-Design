import Directory_Example.Directory;
import Directory_Example.File;
import Task_Management.SimpleTask;
import Task_Management.TaskManager;

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

        Directory subDir1 = new Directory("FrontEnd Directory");
        Directory subDir2 = new Directory("BackEnd Directory");
        File cssFile = new File("CSS File", 100);
        File htmlFile = new File("HTML File", 100);
        File jsFile = new File("JS File", 100);
        File jsonFile = new File("JSON File", 100);

        subDir1.add(cssFile);
        subDir1.add(htmlFile);
        subDir1.add(jsFile);
        subDir1.add(jsonFile);

        File javaFile = new File("Java File", 100);
        File springFile = new File("Spring File", 100);
        File databaseFile = new File("Database File", 100);
        File sqlFile = new File("SQL File", 100);

        subDir2.add(javaFile);
        subDir2.add(springFile);
        subDir2.add(databaseFile);
        subDir2.add(sqlFile);

        rootDir.add(subDir1);
        rootDir.add(subDir2);


        rootDir.open();


        System.out.println("---------------------------------------------");

        SimpleTask task = new SimpleTask();
        task.setTitle("Make the frontend");
        task.setPriority("Medium");

        SimpleTask task1 = new SimpleTask();
        task1.setTitle("Make the Backend");
        task1.setPriority("High");

        SimpleTask task2 = new SimpleTask();
        task2.setTitle("Make the Database");
        task2.setPriority("High");

        TaskManager taskManager = new TaskManager();

        taskManager.setTitle("Task Manager For Developers");

        taskManager.addTask(task);
        taskManager.addTask(task1);
        taskManager.addTask(task2);

        taskManager.display();
    }
}