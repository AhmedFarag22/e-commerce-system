package shopping;

import model.Product;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items = new LinkedHashMap<>();

    public void addProduct(Product product, int quantity) {
        if (product.getQuantity() < (quantity + items.getOrDefault(product, 0)) ) {
            throw new IllegalArgumentException("Not enough stock for product: " + product.getName());
        }
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public Map<Product, Integer> getItems() {
        return items;
    }
}
