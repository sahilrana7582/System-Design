public class User {
    private Request request;

    public void createRequest(int sourceFloor, Integer destinationFloor, Direction direction) {
        if (destinationFloor == null) {
            this.request = RequestFactory.createExternalRequest(sourceFloor, direction);
        } else {
            this.request = RequestFactory.createInternalRequest(sourceFloor, destinationFloor);
        }
    }

    public Request getRequest() {
        return request;
    }
}

// Request Interface