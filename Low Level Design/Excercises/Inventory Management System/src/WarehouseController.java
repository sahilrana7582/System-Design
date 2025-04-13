import java.util.ArrayList;
import java.util.List;

public class WarehouseController {

    private String name;
    private String rating;
    private List<Warehouse> warehouses = new ArrayList<>();
    private WarehouseSelectStratergy warehouseSelectStratergy;

    public WarehouseController(String name, String rating) {
        this.name = name;
        this.rating = rating;
    }

    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    public void setWarehouseSelectStratergy(WarehouseSelectStratergy warehouseSelectStratergy) {
        this.warehouseSelectStratergy = warehouseSelectStratergy;
    }

    public Warehouse selectWarehouse(Order order) {
        return warehouseSelectStratergy.selectWarehouse(warehouses, order);
    }



}
