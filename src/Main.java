import model.Customer;
import model.Product;
import model.ShippableExpirableProduct;
import model.ShippableProduct;
import service.CheckoutService;
import shopping.Cart;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        // Without any Error

        Product cheese = new ShippableExpirableProduct("Cheese", 100, 10, 0.2, LocalDate.of(2025, 12, 20));
        Product biscuits = new ShippableExpirableProduct("Biscuits", 150, 5, 0.7, LocalDate.of(2025, 12, 31));
        Product tv = new ShippableProduct("TV", 300, 3, 3.0);
        Product scratchCard = new Product("Scratch Card", 50, 100);

        Customer customer = new Customer("Ahmed", 1000);
        Cart cart = new Cart();

        cart.addProduct(cheese, 2);
        cart.addProduct(biscuits, 1);
        cart.addProduct(scratchCard, 1);

        CheckoutService.checkout(customer,cart);









        /* One product is out of stock or expired Error

        Product cheese = new ShippableExpirableProduct("Cheese", 100, 10, 0.2, LocalDate.of(2025, 12, 20));
        Product biscuits = new ShippableExpirableProduct("Biscuits", 150, 5, 0.7, LocalDate.of(2025, 12, 31));
        Product tv = new ShippableProduct("TV", 300, 3, 3.0);
        Product scratchCard = new Product("Scratch Card", 50, 100);

        Customer customer = new Customer("Ahmed", 1000);
        Cart cart = new Cart();

        cart.addProduct(cheese, 2);
        cart.addProduct(biscuits, 1);
        cart.addProduct(scratchCard, 1);
        cart.addProduct(tv, 5);

        CheckoutService.checkout(customer,cart);

        */









        /* Cart is empty Error

        Product cheese = new ShippableExpirableProduct("Cheese", 100, 10, 0.2, LocalDate.of(2025, 12, 20));
        Product biscuits = new ShippableExpirableProduct("Biscuits", 150, 5, 0.7, LocalDate.of(2025, 12, 31));
        Product tv = new ShippableProduct("TV", 300, 3, 3.0);
        Product scratchCard = new Product("Scratch Card", 50, 100);

        Customer customer = new Customer("Ahmed", 300);
        Cart cart = new Cart();

        CheckoutService.checkout(customer,cart);

        */













        /* Customer's balance is insufficient Error.

        Product cheese = new ShippableExpirableProduct("Cheese", 100, 10, 0.2, LocalDate.of(2025, 12, 20));
        Product biscuits = new ShippableExpirableProduct("Biscuits", 150, 5, 0.7, LocalDate.of(2025, 12, 31));
        Product tv = new ShippableProduct("TV", 300, 3, 3.0);
        Product scratchCard = new Product("Scratch Card", 50, 100);

        Customer customer = new Customer("Ahmed", 300);
        Cart cart = new Cart();

        cart.addProduct(cheese, 2);
        cart.addProduct(biscuits, 1);
        cart.addProduct(scratchCard, 1);

        try {
            CheckoutService.checkout(customer, cart);
        } catch (Exception e) {
            System.out.println("Checkout failed: " + e.getMessage());
        }

        */




    }
}