import java.util.List;

public interface WarehouseSelectStratergy {

    Warehouse selectWarehouse(List<Warehouse> warehouses, Order order);
}
