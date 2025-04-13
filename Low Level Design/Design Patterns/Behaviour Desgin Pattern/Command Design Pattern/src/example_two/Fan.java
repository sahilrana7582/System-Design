package example_two;

public class Fan {
    private String name;

    public Fan(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println("Fan " + name + " turned on");
    }

    public void turnOff() {
        System.out.println("Fan " + name + " turned off");
    }

    public void setSpeed(int speed) {
        System.out.println("Fan " + name + " speed set to " + speed);
    }



}
