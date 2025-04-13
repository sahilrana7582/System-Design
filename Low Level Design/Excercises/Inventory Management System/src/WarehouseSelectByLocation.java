import java.util.List;

public class WarehouseSelectByLocation implements WarehouseSelectStratergy {



    @Override
    public Warehouse selectWarehouse(List<Warehouse> warehouses, Order order) {
        String zipCode = order.getAddress().getZipCode();

        for (Warehouse warehouse : warehouses) {
            if (warehouse.getAddress().getZipCode().equals(zipCode)) {
                return warehouse;
            }
        }
        return null;
    }
}
