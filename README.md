# 🍰 Cake Shop System – Design Patterns Project

This project demonstrates how multiple *Design Patterns* can be applied together in a simple, real-world scenario: a *Cake Shop system*.

Instead of implementing each pattern separately, the goal was to understand *when and why* each pattern is used by integrating them into one coherent design.

---

## 🧠 Design Patterns Used

### 1️⃣ Factory Pattern
Used to create different types of cakes without exposing the creation logic.

*Examples:*
- AppleCake
- ChocolateCake
- CheeseCake

This makes the system flexible and easy to extend with new cake types.

---

### 2️⃣ Decorator Pattern
Used to add extra features (toppings) to cakes dynamically at runtime.

*Examples:*
- Cream
- Skittles
- Chocolate Chips

This avoids creating a large number of subclasses for every possible cake–topping combination.

---

### 3️⃣ Singleton Pattern
Ensures that only *one instance* of certain system components exists (e.g., the main Cake Shop controller).

This helps maintain consistency across the system.

---

### 4️⃣ Observer Pattern
Used to notify different parts of the system when an order state changes.

*Examples:*
- Customer Dashboard
- Manager Dashboard

Observers are automatically updated without tightly coupling them to the order logic.

---

## 🧩 System Overview

The system simulates a basic cake ordering workflow:
1. A cake is created using the Factory Pattern.
2. Optional toppings are added using the Decorator Pattern.
3. A single Cake Shop instance manages orders (Singleton).
4. Order updates are broadcast to registered observers (Observer).

---

## 🎯 Learning Outcomes

- Understanding how multiple design patterns work *together*
- Applying design patterns to a realistic scenario
- Improving code flexibility and maintainability
- Reducing tight coupling between system components

---

## 🚀 Future Improvements

- Add more cake types and toppings
- Introduce pricing strategies
- Improve order lifecycle handling
- Add persistence (database or file storage)

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- UML Diagrams
- Design Patterns

---

## 📌 Author

*Rand Ethar*  
Flutter Developer | Software Engineering Student

---

Feel free to explore the code and suggest improvements 😊
