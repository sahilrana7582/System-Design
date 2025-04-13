import java.util.ArrayList;
import java.util.List;

public class City {

    private String cityId;
    private String cityName;
    private String postalCode;
    private List<Theatre> theatres;

    public City(String cityId, String cityName, String postalCode) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.postalCode = postalCode;
        theatres = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre) {
        theatres.add(theatre);
    }

    public Theatre getTheatre(String theatreId) {
        for (Theatre theatre : theatres) {
            if (theatre.getTheatreId().equals(theatreId)) {
                return theatre;
            }
        }
        return null;
    }

    // Getters and Setters
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public List<Theatre> getTheatres() {
        return theatres;
    }

    public void setTheatres(List<Theatre> theatres) {
        this.theatres = theatres;
    }
}
