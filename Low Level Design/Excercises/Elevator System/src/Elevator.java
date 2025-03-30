import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Elevator {
    private int currentFloor;
    private State state;
    private Direction direction;
    private List<User> externalRequests = new ArrayList<>();
    private PriorityQueue<Integer> internalRequests;
    private String name;

    public Elevator(String name) {
        this.name = name;
        this.state = State.STOPPED;
        this.currentFloor = 1;
        this.direction = Direction.UP;
        this.internalRequests = new PriorityQueue<Integer>();
    }

    public void move(int sourceFloor, int destinationFloor, Direction direction) {
        System.out.println("Elevator: " + name + " moving from " + sourceFloor + " to " + destinationFloor + " direction: " + direction);
        this.setState(State.MOVING);
        this.direction = direction;

        // Simulate movement
        try {
            Thread.sleep(1000 * Math.abs(destinationFloor - sourceFloor));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.currentFloor = destinationFloor;
    }

    public void stop() {
        System.out.println("Elevator: " + name + " stopped on: " + currentFloor + " direction: " + direction);
        this.setState(State.STOPPED);
    }

    public void openDoor() {
        System.out.println("Elevator: " + name + " opening doors at floor " + currentFloor);
        setState(State.DOOR_OPENING);

        // Simulate door opening time
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setState(State.DOOR_OPEN);
        System.out.println("Elevator: " + name + " doors open at floor " + currentFloor);
    }

    public void closeDoor() {
        System.out.println("Elevator: " + name + " closing doors at floor " + currentFloor);
        setState(State.DOOR_CLOSING);

        // Simulate door closing time
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setState(State.STOPPED);
        System.out.println("Elevator: " + name + " doors closed at floor " + currentFloor);
    }

    public void pickup(User user) {
        externalRequests.add(user);
        processRequests();
    }

    public void processRequests() {
        while (!externalRequests.isEmpty() || !internalRequests.isEmpty()) {
            if (!internalRequests.isEmpty()) {
                int destinationFloor = internalRequests.poll();
                Direction moveDirection = destinationFloor > currentFloor ? Direction.UP : Direction.DOWN;
                move(currentFloor, destinationFloor, moveDirection);
                stop();
                openDoor();
                // Wait for passengers to exit
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                closeDoor();
            } else if (!externalRequests.isEmpty()) {
                User user = externalRequests.remove(0);
                Request request = user.getRequest();
                int sourceFloor = request.getSourceFloor();
                Direction moveDirection = sourceFloor > currentFloor ? Direction.UP : Direction.DOWN;

                move(currentFloor, sourceFloor, moveDirection);
                stop();
                openDoor();

                // If it's an internal request, add the destination
                if (request instanceof InternalRequest) {
                    addDestinationFloor(((InternalRequest) request).getDestinationFloor());
                }

                // Wait for passenger to enter
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                closeDoor();
            }
        }

        // Set to IDLE when no more requests
        this.direction = Direction.NONE;
        setState(State.IDLE);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void addDestinationFloor(int floor) {
        internalRequests.add(floor);
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
