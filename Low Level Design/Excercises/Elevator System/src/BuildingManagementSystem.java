
public class BuildingManagementSystem {
    private ElevatorController controller;
    private int floorCount;

    public BuildingManagementSystem(int elevatorCount, int floorCount) {
        this.controller = new ElevatorController();
        this.floorCount = floorCount;

        // Initialize elevators
        for (int i = 1; i <= elevatorCount; i++) {
            Elevator elevator = new Elevator("Elevator " + i);
            controller.addElevator(elevator);
        }
    }

    public void requestElevator(int sourceFloor, Integer destinationFloor, Direction direction) {
        if (isValidFloor(sourceFloor) && (destinationFloor == null || isValidFloor(destinationFloor))) {
            User user = new User();
            user.createRequest(sourceFloor, destinationFloor, direction);
            controller.addExternalRequest(user);
        } else {
            System.out.println("Invalid floor request. Building has floors 1-" + floorCount);
        }
    }

    private boolean isValidFloor(int floor) {
        return floor >= 1 && floor <= floorCount;
    }


}

