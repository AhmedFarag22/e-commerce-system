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







 Concepts Used
 
✅ Inheritance

✅ Interfaces

✅ Polymorphism (instanceof)

✅ Encapsulation

✅ Java Collections (Map, List)

✅ Error Handling

✅ Separation of concerns

