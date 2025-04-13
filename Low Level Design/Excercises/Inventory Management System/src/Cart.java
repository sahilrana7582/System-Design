import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items = new HashMap<>();
    private Address address;
    private double total = 0;

    public Cart(Address address) {
        this.address = address;
    }

    public void addItem(Product product, int quantity) {
        items.put(product, quantity);
        total += product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                ", address=" + address +
                ", total=" + total +
                '}';
    }
}
