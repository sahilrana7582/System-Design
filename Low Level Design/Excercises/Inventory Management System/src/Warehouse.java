public class Warehouse {
    private Inventory inventory;
    private Address address;

    public Warehouse(Inventory inventory, Address address) {
        this.inventory = inventory;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "inventory=" + inventory +
                ", address=" + address +
                '}';
    }
}