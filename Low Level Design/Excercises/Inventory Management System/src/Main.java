import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("===== Inventory Management System Simulation Start =====");
        System.out.println("\n[Loading] Initializing system components...\n");
        Thread.sleep(1000);

        // Step 1: Create User Address
        System.out.println("===== ADDRESS CREATION =====");
        Address userAddress = new Address("123 Main St", "Delhi", "Delhi", "110001");
        System.out.println("✅ User Address Created: " + userAddress);
        Thread.sleep(500);

        // Step 2: Create Products
        System.out.println("\n===== PRODUCT CREATION =====");
        Product product1 = new Product("P001", "Laptop", "Gaming Laptop", 80000.0f, 5, "Electronics");
        Product product2 = new Product("P002", "Phone", "Smartphone", 30000.0f, 10, "Electronics");
        System.out.println("✅ Products Created:");
        System.out.println("   - " + product1);
        System.out.println("   - " + product2);
        Thread.sleep(500);

        // Step 3: Create Product Category
        System.out.println("\n[Loading] Creating product categories...");
        ProductCatergory electronics = new ProductCatergory("C001", "Electronics", "Electronic items");
        electronics.addProduct(product1);
        electronics.addProduct(product2);
        System.out.println("✅ Category Created: " + electronics);
        Thread.sleep(500);

        // Step 4: Create Inventory
        System.out.println("\n[Loading] Initializing inventory...");
        Inventory inventory = new Inventory();
        inventory.addProductCatergory(electronics);
        System.out.println("✅ Inventory Updated with Electronics Category");
        Thread.sleep(500);

        // Step 5: Create Warehouse
        System.out.println("\n===== WAREHOUSE SETUP =====");
        Address warehouseAddress = new Address("45 Tech Park", "Delhi", "Delhi", "110001");
        Warehouse warehouse = new Warehouse(inventory, warehouseAddress);
        System.out.println("✅ Warehouse Established at: " + warehouseAddress);
        Thread.sleep(500);

        // Step 6: Create Cart
        System.out.println("\n===== SHOPPING CART =====");
        Cart cart = new Cart(userAddress);
        cart.addItem(product1, 1);
        cart.addItem(product2, 2);
        System.out.println("🛒 Cart Contents:");
        System.out.println("   - Laptop x1 @ ₹80,000.00");
        System.out.println("   - Phone x2 @ ₹30,000.00 each");
        System.out.println("   Total Cart Value: ₹" + (80000 + 30000*2));
        Thread.sleep(1000);

        // Step 7: Create User
        System.out.println("\n[Loading] Creating user profile...");
        User user = new User("U001", "Sahil", "sahil@example.com", userAddress, cart);
        System.out.println("✅ User Created: " + user);
        Thread.sleep(500);

        // Step 8: Warehouse Controller Setup
        System.out.println("\n===== WAREHOUSE CONTROLLER =====");
        WarehouseController warehouseController = new WarehouseController("MainController", "4.9");
        warehouseController.addWarehouse(warehouse);
        warehouseController.setWarehouseSelectStratergy(new WarehouseSelectByLocation());
        System.out.println("✅ Warehouse Controller Configured with Location Strategy");
        Thread.sleep(500);

        // Step 9: Create Order
        System.out.println("\n===== ORDER PROCESSING =====");
        Map<Product, Integer> orderItems = new HashMap<>();
        orderItems.put(product1, 1);
        orderItems.put(product2, 2);
        double total = product1.getPrice() * 1 + product2.getPrice() * 2;
        Order order = new Order("O001", "Pending", null, userAddress, null, orderItems, total);
        System.out.println("📦 Order Created:");
        System.out.println("   Order ID: O001");
        System.out.println("   Items:");
        System.out.println("   - Gaming Laptop x1");
        System.out.println("   - Smartphone x2");
        System.out.println("   Subtotal: ₹140,000.00");
        System.out.println("   Tax (10%): ₹14,000.00");
        System.out.println("   Total: ₹154,000.00");
        Thread.sleep(1000);

        // Step 10: Warehouse Selection
        System.out.println("\n[Loading] Selecting nearest warehouse...");
        Warehouse selectedWarehouse = warehouseController.selectWarehouse(order);
        if (selectedWarehouse != null) {
            System.out.println("✅ Warehouse Selected: " + selectedWarehouse);
        } else {
            System.out.println("❌ No suitable warehouse found");
        }
        Thread.sleep(500);

        // Step 11: Finalize Order
        System.out.println("\n[Loading] Finalizing order details...");
        Order finalOrder = new Order("O001", "Pending", null, userAddress, selectedWarehouse, orderItems, total);
        System.out.println("✅ Order Finalized with Warehouse Assignment");
        Thread.sleep(500);

        // Step 12: Payment Processing
        System.out.println("\n===== PAYMENT PROCESSING =====");
        PaymentStratergy paymentStratergy = new CardPayment();
        System.out.println("💳 Processing Card Payment...");
        paymentStratergy.pay(finalOrder);
        System.out.println("✅ Payment Successful!");
        System.out.println("   Order Status: " + finalOrder.getStatus());
        System.out.println("   Payment Method: " + finalOrder.getPaymentMethod());
        Thread.sleep(1000);

        // Invoice Details
        System.out.println("\n===== INVOICE GENERATION =====");
        System.out.println("📄 Invoice Details:");
        System.out.println("   Invoice ID: O001");
        System.out.println("   Date: " + LocalDate.now());
        System.out.println("   Billing Address: " + userAddress);
        System.out.println("   Items Total: ₹140,000.00");
        System.out.println("   Tax: ₹14,000.00");
        System.out.println("   Amount Paid: ₹154,000.00");
        System.out.println("   Payment Status: Paid");

        System.out.println("\n===== Simulation Complete =====");
    }
}