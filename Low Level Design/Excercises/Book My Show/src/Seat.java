public class Seat {

    private String seatId;
    private String seatType;
    private String seatStatus;
    private String seatCost;

    public Seat(String seatId, String seatType, String seatStatus, String seatCost) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.seatStatus = seatStatus;
        this.seatCost = seatCost;
    }

    // Getters
    public String getSeatId() {
        return seatId;
    }

    public String getSeatType() {
        return seatType;
    }

    public String getSeatStatus() {
        return seatStatus;
    }

    public String getSeatCost() {
        return seatCost;
    }

    // Setters
    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public void setSeatStatus(String seatStatus) {
        this.seatStatus = seatStatus;
    }

    public void setSeatCost(String seatCost) {
        this.seatCost = seatCost;
    }
}
