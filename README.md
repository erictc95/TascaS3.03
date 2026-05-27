# 🚀 TascaS3.03 - Patterns II

## 📖 Introduction

This project continues the practice of applying **design patterns** to solve common software development problems using clean, maintainable, and scalable architectures.

The project focuses on the implementation of the following design patterns:

- Builder
- Observer
- Decorator

The goal is to improve the understanding of when and how to apply each pattern while following the **SOLID principles** and writing low-coupled, extensible code.

All functionalities are validated through **unit testing**.

---

# 📦 Technologies Used

- Java 21
- Maven
- JUnit 5

---

# 📁 Project Structure

```bash
TascaS3.03
│
├── level1-builder
├── level2-observer
├── level3-decorator
└── src/test

🔹 Level 1 — Builder Pattern
📌 Description

Implementation of a restaurant menu system using the Builder design pattern with a Fluent Builder approach.

The project also applies the concept of progressive interfaces, ensuring that menus are built step by step in the correct order while preventing invalid configurations.

The system supports different types of menus with customizable dishes and optional configurations.

✅ Features

The menu system allows:

Creating menus step by step
Building full menus, kids menus, and half menus
Optional drinks and desserts
Choosing between dessert or coffee
Configuring dishes as:
Vegan
Gluten Free
Adding supplements to the main course
🧱 Implemented Requirements
Fluent Builder implementation
Progressive interfaces
Validation of construction order
Prevention of invalid combinations
Expressive configuration methods without boolean parameters
Unit tests with multiple menu configurations
🔹 Level 2 — Observer Pattern
📌 Description

Implementation of a stock market notification system using the Observer design pattern.

A StockAgent acts as the observable entity and automatically notifies multiple broker agencies whenever the stock market changes.

Observers can subscribe or unsubscribe dynamically during runtime.

✅ Features

The stock notification system allows:

Adding observers dynamically
Removing observers dynamically
Broadcasting stock market updates
Notifying all subscribed observers automatically
Simulating stock market increases and decreases
🧱 Implemented Requirements
Observable
Maintains observer references
Calls notifyObservers() when the state changes
Observers
Receive notifications automatically
Display stock market updates
Testing
Observer subscription tests
Observer removal tests
Stock market simulation tests
Notification validation tests
🔹 Level 3 — Decorator Pattern
📌 Description

Implementation of a customizable Bubble Tea application using the Decorator design pattern.

The system allows drinks to be dynamically composed by adding ingredients and extras without creating subclasses for every possible combination.

Each decoration modifies:

The final description
The final price
🧋 Available Bubble Tea Bases
Latte
Matcha
Tea
🍬 Available Decorators
Ice
Sugar
Tapioca
Flavor

Multiple flavors can be added dynamically, increasing the total cost accordingly.

✅ Features

The Bubble Tea system allows:

Dynamic drink customization
Flexible ingredient combinations
Runtime composition of beverages
Cost calculation based on decorators
Automatic description generation
🧱 Implemented Requirements
BubbleTea interface
Base drink implementations
Abstract decorator structure
Concrete decorators
Dynamic cost updates
Dynamic description updates
Unit tests for multiple drink combinations
🧪 Unit Tests

All levels include unit tests to validate:

Correct pattern implementation
Expected behavior
Dynamic object composition
Observer notifications
Menu construction rules

Run tests with:

mvn test
▶️ Running the Project
Compile the project
mvn clean install
Run the application
mvn spring-boot:run

Only if the project includes Spring Boot.

🎯 Learning Objectives Achieved
Application of SOLID principles
Correct implementation of creational, behavioral, and structural patterns
Fluent API design
Progressive interface implementation
Dynamic object composition
Runtime behavior management
Low coupling and extensibility
Unit testing coverage
👨‍💻 Author

## Developed by Eric Tarrés Cabrisas
