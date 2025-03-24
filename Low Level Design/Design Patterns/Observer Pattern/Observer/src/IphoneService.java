public class IphoneService extends StockService{

    private String name = "Iphone";
    private String model = "X";
    private Boolean inStock = true;

    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public Boolean isInStock() {
        return inStock;
    }

     public void changeStock() {
        inStock = !inStock;
        this.notifyObservers();
    }
}
