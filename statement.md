# Inventory Management System

## 1. Problem Statement

Managing inventory manually can become difficult when the number of products and suppliers increases. Keeping track of product details, stock quantities, suppliers, and stock movements using notebooks or separate records can lead to mistakes, outdated information, and difficulty in finding required records.

The Inventory Management System is developed to provide a simple and organized solution for managing basic inventory operations. The system allows users to maintain product and supplier records, update stock quantities, and keep track of stock transactions through a Java-based console application.

The project aims to reduce manual effort and provide a structured way to perform common inventory management operations.

## 2. Scope of the Project

The scope of the project covers the basic operations required to manage an inventory system.

The system includes:

- Adding, viewing, searching, updating, and deleting product records
- Adding, viewing, updating, and deleting supplier records
- Adding stock to existing products
- Removing stock from products
- Viewing current stock quantities
- Recording stock-related transactions
- Validating user input
- Handling invalid operations
- Storing and retrieving records using files

The project focuses on basic inventory management through a console-based interface. It does not currently include advanced features such as online access, cloud storage, or database connectivity.

The system can be extended in the future by adding a database, graphical user interface, user authentication, automated reports, and low-stock notifications.

## 3. Target Users

The system is intended for users who need to manage basic inventory information, including:

- Small business owners
- Shop owners
- Store managers
- Inventory staff
- Small-scale retailers
- Students and beginners learning inventory management systems

The application is particularly suitable for small-scale inventory operations where a simple and easy-to-use system is sufficient.

## 4. High-Level Features

### Product Management

Users can add, view, search, update, and delete product records. Product information can include details such as product ID, name, price, and quantity.

### Supplier Management

Users can maintain supplier records by adding new suppliers, viewing their information, updating details, and deleting records when required.

### Stock Management

The system allows users to add and remove stock and check the current quantity of products.

### Transaction Management

Stock additions and removals can be recorded as transactions so that inventory movements can be maintained.

### Input Validation

The application validates user input and handles incorrect values such as invalid IDs, quantities, or menu choices.

### File-Based Storage

The system uses files to store inventory-related information so that records can be maintained between program executions.

### Menu-Driven Interface

The application provides a simple console menu that allows users to select and perform different inventory operations.

## 5. System Workflow

The general workflow of the system is:

```text
Start
  ↓
Display Main Menu
  ↓
Select Required Operation
  ↓
Enter Information
  ↓
Validate Input
  ↓
Perform Operation
  ↓
Update / Store Data
  ↓
Display Result
  ↓
Return to Main Menu
  ↓
Exit
