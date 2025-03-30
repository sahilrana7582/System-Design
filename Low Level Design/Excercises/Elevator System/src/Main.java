public class Main {
    public static void main(String[] args) {
        // Create a building with 3 elevators and 20 floors
        BuildingManagementSystem building = new BuildingManagementSystem(3, 20);

        // Simulate some elevator requests
        System.out.println("--- Simulating elevator requests ---");

        building.requestElevator(5, null, Direction.UP);

        // Add a slight delay between requests
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Person on floor 10 wants to go to floor 2
        building.requestElevator(10, 2, Direction.DOWN);

        // Add another delay
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Person on floor 1 wants to go to floor 15
        building.requestElevator(1, 15, Direction.UP);

        System.out.println("--- Simulation complete ---");
    }
}