📦 Inventory Management System
A Java-based console application for managing products, suppliers, stock, transactions, and inventory reports.

Build Your Own Project (BYOP) — VITyarthi

📌 About the Project

The Inventory Management System is a menu-driven Java application developed to simplify basic inventory operations.

The system allows users to manage product and suppliers, perform Stock IN and Stock OUT operations, maintain stock transaction history, identify low-stock products, and generate a basic inventory report.

The project is designed using a modular Java structure with separate Model, Service, and Utility components. Data is stored locally using Java object serialization in .dat files, so the records remain available after restarting the application.

🎯 Objectives

The main objectives of the project are to:

Manage product records in an organized way.
Maintain supplier information.
Track available stock quantities.
Record Stock IN and Stock OUT operations.
Maintain transaction history.
Identify products that require restocking.
Generate basic inventory information.
Apply Java Object-Oriented Programming concepts in a practical project.
✨ Features
🛒 Product Management

The system provides complete product management operations:

Add Product
View Products
Search Product
Update Product
Delete Product

Each product contains information such as:

Product ID · Name · Category · Price · Quantity · Reorder Level · Supplier ID

🚚 Supplier Management

Supplier records can be managed through:

Add Supplier
View Suppliers
Search Supplier
Update Supplier
Delete Supplier

Supplier information includes:

Supplier ID · Name · Contact · Email

📦 Stock Management

The system provides basic stock control:

Stock IN
Stock OUT
Check current stock
Display low-stock products
Validate available stock before Stock OUT

The system prevents a Stock OUT operation when the requested quantitys is greater than the available quantity.

🔄 Transaction Management

Stock movements are recorded as transactions.

Each transaction stores:

Transaction ID
Product ID
Transaction Type
Quantity
Date and Time

Users can also view the transaction history.

⚠️ Low-Stock Detection
The system checks the current quantity againsts the product's reorder level.
If Quantity <= Reorder Level
        ↓
Product is identified as Low Stock
This allows products requiring replenishment to be identified easily.
📊 Inventory Report

The application provides a basic inventory summary containing:

Total number of products
Total stock units
Number of low-stock products
Total inventory value

The inventory value is calculated using:
Inventory Value = Product Price × Product Quantity
🧠 Technologies & Concepts
| Technology / Concept   | Used For                              |
| ---------------------- | ------------------------------------- |
| **Java**               | Application development               |
| **OOP**                | Classes, objects and encapsulation    |
| **ArrayList**          | Managing collections of records       |
| **File Handling**      | Reading and writing stored data       |
| **Serialization**      | Persistent storage of Java objects    |
| **Exception Handling** | Handling invalid operations and input |
| **Packages**           | Organizing the application            |
| **Console Interface**  | User interaction                      |
🏗️ Project Architecture

The project follows a simple modular architecture.
                         USER
                           │
                           ▼
                       Main.java
                    (User Interface)
                           │
             ┌─────────────┼─────────────┐
             ▼             ▼             ▼
      ProductService  SupplierService  StockService
             │             │             │
             ▼             ▼             ▼
          Product       Supplier    StockTransaction
             │             │             │
             └─────────────┼─────────────┘
                           ▼
                      FileManager
                           │
                           ▼
                    .dat Data Files
Model

Contains the main data classes:

Product
Supplier
StockTransaction
Service

Contains the main business operations:

ProductService
SupplierService
StockService
Utility

Contains supporting classes:

Main
FileManager
InputValidator
📁 Project Structure
Inventory Management System
│
├── inventory
│   │
│   ├── model
│   │   ├── Product.java
│   │   ├── Supplier.java
│   │   └── StockTransaction.java
│   │
│   ├── service
│   │   ├── ProductService.java
│   │   ├── SupplierService.java
│   │   └── StockService.java
│   │
│   └── util
│       ├── FileManager.java
│       ├── InputValidator.java
│       └── Main.java
│
├── data
│   ├── products.dat
│   ├── suppliers.dat
│   └── transactions.dat
│
├── README.md
└── statement.md
Number of Java Classes

9 Java classes

The project is divides into:

3 Model classes
3 Service classes
3 Utility classes

This separation keeps the code organized and makes individual responsibilities easier to manage.
💾 Data Storage

The project uses Java Serialization instead of a database.

Three data files are used:
products.dat
suppliers.dat
transactions.dat
File	Purpose
products.dat	Stores product records
suppliers.dat	Stores supplier records
transactions.dat	Stores stock transaction records

The FileManager class handles saving and loading these objects.

🔄 Application Workflow
START
  │
  ▼
Load Saved Data
  │
  ▼
Display Main Menu
  │
  ▼
Select Operation
  │
  ├── Product Management
  │
  ├── Supplier Management
  │
  ├── Stock Management
  │
  ├── Transaction History
  │
  └── Reports
  │
  ▼
Validate Input
  │
  ▼
Perform Operation
  │
  ▼
Update Data
  │
  ▼
Save Data
  │
  ▼
Display Result
  │
  ▼
Continue or Exit
⚙️ Requirements

Before running the project, install:

Java JDK
Command Prompt / Terminal or a Java IDE

No external database or third-party library is required.

▶️ How to Run
1. Open the Project

Open the project folder containing the inventory and data directories.

2. Compile

Run:
javac -d bin inventory/model/*.java inventory/service/*.java inventory/util/*.java

3. Run
java -cp bin inventory.util.Main
The application will start with the main menu.

🧪 Testing

The major operations of the system were checked, including:
| Operation     | Test Performed                         |
| ------------- | -------------------------------------- |
| Product       | Add, View, Search, Update, Delete      |
| Supplier      | Add, View, Search, Update, Delete      |
| Stock         | Stock IN and Stock OUT                 |
| Validation    | Invalid input handling                 |
| Stock Control | Prevent excessive Stock OUT            |
| Low Stock     | Check products at/below reorder level  |
| Transactions  | Record and display transaction history |
| Reports       | Generate inventory summary             |
| Persistence   | Save and reload `.dat` data            |
🖥️ Screenshots

Screenshots of the working application can be added here.

Main Menu

Product Management

Supplier Management

Stock Management

Product Added Successfully

Note: Keep only the screenshot links for images that you have actually uploaded to the screenshots folder.

📚 Learning Outcomes

Through this project, the following concepts were applied:

Java Classes and Objects
Encapsulation
ArrayList
Packages
CRUD Operations
File Handling
Object Serialization
Exception Handling
Input Validation
Modular Programming
Service-based Design
Data Persistence
Testing and Debugging
🚀 Future Enhancements

The system can be further extended with:

🗄️ Database integration
🖥️ Graphical User Interface
🔐 User authentication
👥 Role-based access
📈 Advanced inventory reports
📄 CSV/PDF report export
🔔 Automated low-stock notifications
🔎 Advanced product filtering and search
📌 Limitations

The current version:

Uses a console-based interface.
Uses local .dat files instead of a relational database.
Does not include user authentication.
Provides basic rather than advanced reporting.
🎓 Academic Information

Project: Build Your Own Project (BYOP)
Project Title: Inventory Management System
Programme: B.Tech CSE (AI & ML)
Semester: 3rd Semester
Institution: Vellore Institute of Technology

👨‍💻 Author
Arya Bhagwat

📄 Related Files
statement.md — Problem statement, scope, target users and high-level features.


If Quantity <= Reorder Level
#### OUTPUT(SCREENSHOTS)

1.product management (add product)
<img width="1600" height="854" alt="image" src="https://github.com/user-attachments/assets/d204ec77-a681-4261-a743-134b69120fba" />

2.product management (view product)
<img width="1600" height="848" alt="image" src="https://github.com/user-attachments/assets/9deccddf-35ce-4e4a-a4cc-f154ce9d8354" />

3.product management(search product)
<img width="1600" height="843" alt="image" src="https://github.com/user-attachments/assets/25a5c9d2-b0ef-4990-8f19-4a9b4fbae091" />

4.product management(update project)
<img width="1600" height="847" alt="image" src="https://github.com/user-attachments/assets/bb72b191-1ea0-48c2-b94d-f330f3595435" />

5.product management(delete product)
<img width="1600" height="851" alt="image" src="https://github.com/user-attachments/assets/3e195a6c-b519-47ed-831d-9edb61838d1a" />

6.back to main screen
<img width="1600" height="844" alt="image" src="https://github.com/user-attachments/assets/57f08553-19a7-4f6d-91e1-b64201d234f3" />

7.supplier management(add supplier)
<img width="1600" height="852" alt="image" src="https://github.com/user-attachments/assets/8ab93890-bb31-42e5-839f-6da1b81a139f" />

8.supplier management(view supplier)
<img width="1600" height="857" alt="image" src="https://github.com/user-attachments/assets/edb13523-dc68-4515-be04-c6dcbc3c6afc" />

9.supplier management(search supplier)
<img width="1600" height="848" alt="image" src="https://github.com/user-attachments/assets/3cd8886b-de12-4220-a3f6-14dd079d6513" />

10.supplier management(update supplier)
<img width="1600" height="847" alt="image" src="https://github.com/user-attachments/assets/519e4860-fcc5-462f-ba5b-dabc88569ba3" />

11.supplier management(delete supplier)
<img width="1600" height="852" alt="image" src="https://github.com/user-attachments/assets/d9a7fe5b-03a0-4e13-bdb2-aad3d5fa1f25" />

12.back to main screen
<img width="1600" height="840" alt="image" src="https://github.com/user-attachments/assets/8f34d058-39c6-438b-83df-6f48925a00ec" />

13.stock management(stock in)
<img width="1600" height="848" alt="image" src="https://github.com/user-attachments/assets/fb6e28bc-adea-4580-ad92-a2cdca02ead2" />

14.stock management(stock out)
<img width="1600" height="848" alt="image" src="https://github.com/user-attachments/assets/8fb49d25-2b95-4b30-8432-10edccb46c5c" />

15.stock management(check stock)
<img width="1600" height="848" alt="image" src="https://github.com/user-attachments/assets/6e406c5c-8e29-4d2c-869c-253997a24eb1" />

16.stock management( low stock product)
<img width="1600" height="847" alt="image" src="https://github.com/user-attachments/assets/917323de-3ef3-4739-bbe7-0ac888a4faf8" />

17.back to main screen
<img width="1600" height="849" alt="image" src="https://github.com/user-attachments/assets/d0dc0be7-d646-440b-9797-2cac63b31ebf" />

18.Transaction history
<img width="1600" height="857" alt="image" src="https://github.com/user-attachments/assets/b0c0969f-e102-432b-ad7f-35cdd468e45d" />

19.reports
<img width="1600" height="851" alt="image" src="https://github.com/user-attachments/assets/b30d8186-ce69-4ecf-be5a-1b1fbff29e9b" />

20.project exit
<img width="1600" height="848" alt="image" src="https://github.com/user-attachments/assets/07eae97c-0124-4eea-8303-21132935d463" />















