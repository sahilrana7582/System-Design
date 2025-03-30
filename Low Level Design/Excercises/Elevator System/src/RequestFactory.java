class RequestFactory {
    public static Request createInternalRequest(int sourceFloor, int destinationFloor) {
        return new InternalRequest(sourceFloor, destinationFloor);
    }

    public static Request createExternalRequest(int sourceFloor, Direction direction) {
        return new ExternalRequest(sourceFloor, direction);
    }
}
