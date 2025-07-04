package service;

import interfaces.Shippable;
import model.Customer;
import model.ExpirableProduct;
import model.Product;
import shopping.Cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            throw new IllegalStateException("Cart is empty");
        }

        double subtotal = 0;
        List<Shippable> toShip = new ArrayList<>();

        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            Product product = entry.getKey();
            int qty = entry.getValue();

            if (product instanceof ExpirableProduct) {
                if( ((ExpirableProduct) product).isExpired()) {
                    throw new IllegalStateException("Product expired: " + product.getName());
                }
            }

            if (product.getQuantity() < qty) {
                throw new IllegalStateException("Out of stock: " + product.getName());
            }

            subtotal += product.getPrice() * qty;

            if (product instanceof Shippable) {
                for (int i = 0; i < qty; i++) {
                    toShip.add((Shippable) product);
                }
            }
        }

        double shipping = toShip.isEmpty() ? 0 : 30;
        double total = subtotal + shipping;

        if (customer.getBalance() < total) {
            throw new IllegalStateException("Insufficient balance");
        }

        customer.pay(total);

        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            entry.getKey().decreaseQuantity(entry.getValue());
        }

        if (!toShip.isEmpty()) {
            ShippingService.ship(toShip);
        }

        System.out.println("** Checkout receipt **");
        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            System.out.println(entry.getValue() + "x " + entry.getKey().getName() + "         " + entry.getKey().getPrice() * entry.getValue());
        }

        System.out.println("------------------");
        System.out.println("Subtotal           " + subtotal);
        System.out.println("Shipping           " + shipping);
        System.out.println("Amount             " + total);
        System.out.println("-------------------");
        System.out.println("Remaining Balance  " + customer.getBalance());
    }
}
