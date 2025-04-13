import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private String orderId;
    private String status;
    private String paymentMethod;
    private Address address;
    private Warehouse warehouseHouseInfo;
    private Map<Product, Integer> items = new HashMap<>();
    private double total = 0;
    private Invoice invoice;

    public Order(String orderId, String status, String paymentMethod, Address address, Warehouse warehouseHouseInfo, Map<Product, Integer> items, double total) {
        this.orderId = orderId;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.address = address;
        this.warehouseHouseInfo = warehouseHouseInfo;
        this.items = items;
        this.total = total;
        this.invoice = new Invoice(orderId, LocalDate.now(),  address, total, 10);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Address getAddress(){
        return address;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public String getStatus(){
        return status;
    }

    public String getPaymentMethod(){
        return paymentMethod;
    }
}
