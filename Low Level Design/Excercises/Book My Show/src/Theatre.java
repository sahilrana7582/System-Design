import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theatre {

    private String theatreId;
    private String theatreName;
    private City theatreAddress;
    private List<Screen> screens;

    public Theatre(String theatreId, String theatreName, City theatreAddress) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.theatreAddress = theatreAddress;
        initializeScreens();
    }

    // Getters and Setters
    public String getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(String theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public City getTheatreAddress() {
        return theatreAddress;
    }

    public void setTheatreAddress(City theatreAddress) {
        this.theatreAddress = theatreAddress;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public void addScreen(Screen screen) {
        screens.add(screen);
    }

    private void initializeScreens() {
        screens = new ArrayList<>();
        Map<Integer, String> screenMap = new HashMap<>();
        screenMap.put(1, "Hollywood Screen");
        screenMap.put(2, "Bollywood Screen");
        screenMap.put(3, "Tollywood Screen");

        for (int i = 1; i <= 3; i++) {
            Screen screen = new Screen("S" + i, screenMap.get(i), 50, new ArrayList<>());
            screens.add(screen);
            System.out.println("Initialized " + screen.getScreenName() + " in " + this.theatreName);
        }
    }
}
