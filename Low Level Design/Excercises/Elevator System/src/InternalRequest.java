class InternalRequest implements Request {
    private int sourceFloor;
    private int destinationFloor;
    private Direction direction;

    public InternalRequest(int sourceFloor, int destinationFloor) {
        this.sourceFloor = sourceFloor;
        this.destinationFloor = destinationFloor;
        this.direction = destinationFloor > sourceFloor ? Direction.UP : Direction.DOWN;
    }

    @Override
    public int getSourceFloor() {
        return sourceFloor;
    }

    @Override
    public Direction getDirection() {
        return direction;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }
}
