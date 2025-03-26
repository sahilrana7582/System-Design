package Advance_ECommerce_Example.Services;

import java.util.HashMap;

public class Inventory {
    private HashMap<String, Integer> inventory = new HashMap<String, Integer>();

    public Inventory(){
        inventory.put("Laptop", 10);
        inventory.put("Mobile", 20);
        inventory.put("Tablet", 30);
        inventory.put("I-Phone", 2);
    }

    public Boolean checkEnoughStocks(String product, int quantity){
        Integer stock = inventory.getOrDefault(product, 0);

        return stock >= quantity;
    }

    public Boolean isAvailable(String product){
        return inventory.containsKey(product);
    }

    public Boolean checkStocks(String product){
        return inventory.get(product) > 0;
    }
}
