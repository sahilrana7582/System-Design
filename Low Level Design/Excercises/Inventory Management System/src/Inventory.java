import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<ProductCatergory> productCatergories = new ArrayList<>();

    public void addProductCatergory(ProductCatergory productCatergory) {
        productCatergories.add(productCatergory);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "productCatergories=" + productCatergories +
                '}';
    }
}
