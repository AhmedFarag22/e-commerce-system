# 🛒 Java Mini E-Commerce System

A simple Java console-based shopping cart system that demonstrates **OOP principles** including inheritance, polymorphism, interfaces, and encapsulation.  
This project simulates an **online checkout system** with support for:
- Products (some shippable, some expirable)
- Customers with balance
- Shopping cart
- Shipping & billing logic

---

## 📦 Features

- Add products to a shopping cart with quantity validation
- Support for:
  - Shippable products
  - Expirable products
  - Products that are both shippable and expirable
- Checkout with:
  - Expiry validation
  - Stock checking
  - Shipping cost calculation
  - Balance deduction
  - Receipt generation

---

## 🧱 Class Overview

- `Product`: Base class for all products.
- `Shippable`: Interface for products that can be shipped.
- `ExpirableProduct`: Products that have an expiry date.
- `ShippableProduct`: Products with weight that can be shipped.
- `ShippableExpirableProduct`: Combination of both expirable and shippable.
- `Customer`: Represents a customer with name and balance.
- `Cart`: Manages cart items.
- `ShippingService`: Simulates product shipping.
- `CheckoutService`: Handles the full checkout process.
- `Main`: Entry point for the test/demo.


Sample Output
text
Copy
Edit
** Shipment notice **
Cheese
200.0g
Cheese
200.0g
Biscuits
700.0g
Total package weight 1.1kg
** Checkout receipt **
2x Cheese        200.00
1x Biscuits      150.00
1x Scratch Card  50.00
----------------------
Subtotal         400.00
Shipping         30.00
Amount           430.00
Remaining Balance        570.00





 Concepts Used
✅ Inheritance

✅ Interfaces

✅ Polymorphism (instanceof)

✅ Encapsulation

✅ Java Collections (Map, List)

✅ Error Handling

✅ Separation of concerns

