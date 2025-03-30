// Elevator Class

// State Enum

// User Class


// Internal Request

// External Request

// Request Factory

// Elevator Controller
import java.util.ArrayList;
import java.util.List;

public class ElevatorController {
    private List<Elevator> elevators;
    private List<User> externalRequests;

    public ElevatorController() {
        this.elevators = new ArrayList<>();
        this.externalRequests = new ArrayList<>();
    }

    public void addElevator(Elevator elevator) {
        elevators.add(elevator);
    }

    // Add an external request (from a user outside the elevator)
    public void addExternalRequest(User user) {
        externalRequests.add(user);
        processRequests(); // Process requests whenever a new one is added
    }

    // Process all pending external requests and assign them to an elevator
    public void processRequests() {
        List<User> processedUsers = new ArrayList<>();

        for (User user : externalRequests) {
            Request req = user.getRequest();
            Elevator bestElevator = findBestElevator(req);
            if (bestElevator != null) {
                bestElevator.pickup(user);
                processedUsers.add(user);
            }
        }

        externalRequests.removeIf(processedUsers::contains);
    }

    private Elevator findBestElevator(Request request) {
        Elevator bestElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator e : elevators) {
            int distance = Math.abs(e.getCurrentFloor() - request.getSourceFloor());

            // Check if elevator is IDLE or going in the same direction
            if (e.getState() == State.IDLE || e.getState() == State.STOPPED ||
                    e.getDirection() == request.getDirection()) {
                if (distance < minDistance) {
                    minDistance = distance;
                    bestElevator = e;
                }
            }
        }

        // If no suitable elevator found, pick the nearest one regardless of direction
        if (bestElevator == null && !elevators.isEmpty()) {
            for (Elevator e : elevators) {
                int distance = Math.abs(e.getCurrentFloor() - request.getSourceFloor());
                if (distance < minDistance) {
                    minDistance = distance;
                    bestElevator = e;
                }
            }
        }

        return bestElevator;
    }
}
