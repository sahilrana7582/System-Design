class ExternalRequest implements Request {
    private int sourceFloor;
    private Direction direction;

    public ExternalRequest(int sourceFloor, Direction direction) {
        this.sourceFloor = sourceFloor;
        this.direction = direction;
    }

    @Override
    public int getSourceFloor() {
        return sourceFloor;
    }

    @Override
    public Direction getDirection() {
        return direction;
    }
}
