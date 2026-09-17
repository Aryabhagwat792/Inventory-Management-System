Inventory Management System
1. Project Overview

The Inventory Management System is a Java-based console application developed to manage products, suppliers, stock, and inventory transactions.

The application provides a simple menu-driven interface through which users can perform common inventory operations. It also includes input validation and file-based data storage for maintaining records.

2. Features
Add, view, search, update, and delete products
Add, view, update, and delete suppliers
Add and remove product stock
View current stock information
Maintain stock transaction records
Validate user input
Store data using files
Simple menu-driven console interface
3. Technologies and Tools Used
Programming Language: Java
Concepts: Object-Oriented Programming, CRUD Operations, Exception Handling, File Handling
JDK: Java JDK 17 or later
IDE: Visual Studio Code
Version Control: Git and GitHub
Storage: Local files
4. Project Structure
5. inventory
├── model
│   ├── Product.java
│   ├── Supplier.java
│   └── StockTransaction.java
│
├── service
│   ├── ProductService.java
│   ├── SupplierService.java
│   └── StockService.java
│
└── util
    ├── FileManager.java
    ├── InputValidator.java
    └── Main.java
The project is divided into packages to keep the code organized and separate different responsibilities.

5. Installation and Running the Project
Requirements

Make sure Java JDK 17 or later is installed.

Check Java using:
java -version
Installation
Clone or download the GitHub repository.
Open the project folder in Visual Studio Code.
Open the terminal.
Make sure the Java source files are present in their respective packages.
Compile the Project
javac -d bin src/main/java/inventory/model/*.java src/main/java/inventory/service/*.java src/main/java/inventory/util/*.java
Run the Project
java -cp bin inventory.util.Main
The main menu will appear in the terminal. Select the required option to use the application.
6. Testing Instructions

The application can be tested by performing the following operations:

Add a new product and verify that it appears in the product list.
Search, update, and delete a product.
Add and manage supplier information.
Add stock to a product and check the updated quantity.
Remove stock and verify the quantity again.
Check stock transaction records.
Enter invalid inputs and verify that the application handles them correctly.
Restart the application and check whether stored data is available.

7. Expected Outcome

The system allows users to manage products and suppliers, track stock, maintain transaction records, and store inventory information through a simple Java console application.

8. Project Objective

The objective of this project is to develop a functional inventory management system using Java while applying Object-Oriented Programming, CRUD operations, input validation, exception handling, and file handling.

9. Author

Inventory Management System
Academic Java Project

<img width="1600" height="854" alt="image" src="https://github.com/user-attachments/assets/d27ef1e4-b418-476c-8a5f-fb0da256ed07" />


