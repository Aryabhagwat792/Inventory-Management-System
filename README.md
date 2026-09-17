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
#### OUTPUT(SCREENSHOTS)

1.product management (add product)
<img width="1600" height="854" alt="image" src="https://github.com/user-attac
    hments/assets/d27ef1e4-b418-476c-8a5f-fb0da256ed07" />
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















