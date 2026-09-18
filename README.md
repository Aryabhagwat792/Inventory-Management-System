Inventory Management System
-Project Overview

The Inventory Management System is a Java-based console application developed to manage products, suppliers, stock, and inventory transactions.

The system provides a simple menu-driven interface where users can perform different inventory operations. It uses Object-Oriented Programming concepts, input validation, and file handling to organize and maintain inventory data.

-Features

Product Management
Add new products
View all products
Search for products
Update product details
Delete products
Supplier Management
Add suppliers
View supplier details
Update supplier information
Delete suppliers
Stock Management
Add stock
Remove stock
View available stock
Update product quantities
Transaction Management
Record stock additions
Record stock removals
Maintain stock transaction records
Other Features
Input validation
Error handling
File-based data storage
Menu-driven console interface
Technologies and Tools Used
Language: Java
Programming Concepts: Object-Oriented Programming, CRUD Operations, Exception Handling, File Handling
JDK: Java JDK 17 or later
IDE: Visual Studio Code
Version Control: Git and GitHub
Storage: Local files

-Project Structure
Inventory Management System
│
└── src
    └── main
        └── java
            └── inventory
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
                    
-Requirements
Before running the project, install:

-Java JDK 17 or later
Visual Studio Code or any Java-compatible IDE
Git (optional)

-Check Java installation:

java -version
Check the compiler:
javac -version
Installation
Clone or download this repository.
Open the project folder in Visual Studio Code.
Open the terminal.
Navigate to the project directory.
Make sure all source files are in their respective packages.

-How to Run:

Compile the project using:
javac -d bin src/main/java/inventory/model/*.java src/main/java/inventory/service/*.java src/main/java/inventory/util/*.java
Run the application using:
java -cp bin inventory.util.Main
The main menu will appear in the terminal. Select the required option and follow the instructions displayed by the application.

-Testing
The following operations can be performed to test the application:

Product Testing
Add a product
View products
Search for a product
Update product details
Delete a product
Supplier Testing
Add a supplier
View suppliers
Update supplier details
Delete a supplier
Stock Testing
Add stock to a product
Remove stock
Check the updated quantity
Test invalid stock quantities
Validation Testing
Enter an invalid menu option
Enter invalid numerical values
Enter an invalid product ID
Enter an invalid quantity
Data Storage Testing
Add or modify records
Exit the application
Run the application again
Verify that the saved records are available

-Application Workflow

Start
  ↓
Main Menu
  ↓
Select Operation
  ↓
Validate Input
  ↓
Perform Operation
  ↓
Update / Save Data
  ↓
Display Result
  ↓
Return to Main Menu

-Screenshots
Screenshots of the working application are included to demonstrate the main functionality.
Product Management
Added screenshot of product operations.
Supplier Management
Added screenshot of supplier operations.
Stock Management
Added screenshot showing stock operations.
Successful Product Addition
Added screenshot showing the successful product addition message.

-Objective
The objective of this project is to develop a simple inventory management application using Java and demonstrate practical use of Object-Oriented Programming, CRUD operations, file handling, input validation, and exception handling.

-Expected Outcome
The application allows users to manage products and suppliers, maintain stock quantities, record inventory transactions, and store inventory data through a simple console-based interface.

-Future Enhancements
The system can be further improved by adding:

-Graphical User Interface
Database connectivity
User authentication
Low-stock notifications
Advanced inventory reports
Product categories
Improved search and filtering
Author

-Inventory Management System
Java Academic Project

-License
This project is developed for educational and academic purposes.

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















