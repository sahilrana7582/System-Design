public class Sallu extends User1{

    private String name = "Sallu";

    public String getName() {
        return name;
    }

    @Override
    public void update() {
        System.out.println(this.name + " Received update from StockService");
    }
}
