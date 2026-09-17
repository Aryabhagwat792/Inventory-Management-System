package inventory;

import inventory.model.Product;
import inventory.model.Supplier;
import inventory.service.ProductService;
import inventory.service.SupplierService;
import inventory.service.StockService;
import inventory.util.InputValidator;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ProductService productService = new ProductService();
    static SupplierService supplierService = new SupplierService();
    static StockService stockService = new StockService();

    public static void main(String[] args) {

        showLowStockWarning();

        while (true) {

            System.out.println("\n========================================");
            System.out.println("       INVENTORY MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Product Management");
            System.out.println("2. Supplier Management");
            System.out.println("3. Stock Management");
            System.out.println("4. Transaction History");
            System.out.println("5. Reports");
            System.out.println("6. Exit");

            int choice = InputValidator.getInt(sc, "Enter your choice: ");

            switch (choice) {
                case 1:
                    productMenu();
                    break;

                case 2:
                    supplierMenu();
                    break;

                case 3:
                    stockMenu();
                    break;

                case 4:
                    stockService.showTransactions();
                    break;

                case 5:
                    reports();
                    break;

                case 6:
                    System.out.println("Thank you for using Inventory Management System!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void productMenu() {

        while (true) {

            System.out.println("\n========== PRODUCT MANAGEMENT ==========");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Back");

            int choice = InputValidator.getInt(sc, "Enter your choice: ");

            switch (choice) {

                case 1:
                    addProduct();
                    break;

                case 2:
                    productService.view();
                    break;

                case 3:
                    searchProduct();
                    break;

                case 4:
                    updateProduct();
                    break;

                case 5:
                    int deleteId = InputValidator.getInt(
                            sc, "Enter product ID: "
                    );
                    productService.delete(deleteId);
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void addProduct() {

        System.out.println("\n========== ADD PRODUCT ==========");

        int id = InputValidator.getInt(sc, "Enter product ID: ");

        if (productService.search(id) != null) {
            System.out.println("Product ID already exists.");
            return;
        }

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter category: ");
        String category = sc.nextLine();

        double price = InputValidator.getDouble(
                sc, "Enter price: "
        );

        int quantity = InputValidator.getInt(
                sc, "Enter quantity: "
        );

        int reorderLevel = InputValidator.getInt(
                sc, "Enter reorder level: "
        );

        int supplierId = InputValidator.getInt(
                sc, "Enter supplier ID: "
        );

        Product p = new Product(
                id,
                name,
                category,
                price,
                quantity,
                reorderLevel,
                supplierId
        );

        productService.add(p);

        System.out.println();
        System.out.println("========================================");
        System.out.println("       PRODUCT ADDED SUCCESSFULLY!");
        System.out.println("========================================");

        stockService.checkWarning(p);
    }

    static void searchProduct() {

        int id = InputValidator.getInt(
                sc, "Enter product ID: "
        );

        Product p = productService.search(id);

        if (p == null) {
            System.out.println("Product not found.");
            return;
        }

        System.out.println("\nProduct Found!");
        System.out.println("ID           : " + p.getId());
        System.out.println("Name         : " + p.getName());
        System.out.println("Category     : " + p.getCategory());
        System.out.println("Price        : " + p.getPrice());
        System.out.println("Quantity     : " + p.getQuantity());
        System.out.println("Reorder Level: " + p.getReorderLevel());
        System.out.println("Supplier ID  : " + p.getSupplierId());
    }

    static void updateProduct() {

        int id = InputValidator.getInt(
                sc, "Enter product ID: "
        );

        if (productService.search(id) == null) {
            System.out.println("Product not found.");
            return;
        }

        System.out.print("Enter new product name: ");
        String name = sc.nextLine();

        System.out.print("Enter new category: ");
        String category = sc.nextLine();

        double price = InputValidator.getDouble(
                sc, "Enter new price: "
        );

        int quantity = InputValidator.getInt(
                sc, "Enter new quantity: "
        );

        int reorderLevel = InputValidator.getInt(
                sc, "Enter new reorder level: "
        );

        int supplierId = InputValidator.getInt(
                sc, "Enter new supplier ID: "
        );

        productService.update(
                id,
                name,
                category,
                price,
                quantity,
                reorderLevel,
                supplierId
        );

        stockService.checkWarning(
                productService.search(id)
        );
    }

    static void supplierMenu() {

        while (true) {

            System.out.println("\n========== SUPPLIER MANAGEMENT ==========");
            System.out.println("1. Add Supplier");
            System.out.println("2. View Suppliers");
            System.out.println("3. Search Supplier");
            System.out.println("4. Update Supplier");
            System.out.println("5. Delete Supplier");
            System.out.println("6. Back");

            int choice = InputValidator.getInt(
                    sc, "Enter your choice: "
            );

            switch (choice) {

                case 1:
                    addSupplier();
                    break;

                case 2:
                    supplierService.view();
                    break;

                case 3:
                    searchSupplier();
                    break;

                case 4:
                    updateSupplier();
                    break;

                case 5:
                    int id = InputValidator.getInt(
                            sc, "Enter supplier ID: "
                    );
                    supplierService.delete(id);
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void addSupplier() {

        int id = InputValidator.getInt(
                sc, "Enter supplier ID: "
        );

        if (supplierService.search(id) != null) {
            System.out.println("Supplier ID already exists.");
            return;
        }

        System.out.print("Enter supplier name: ");
        String name = sc.nextLine();

        System.out.print("Enter contact: ");
        String contact = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        supplierService.add(
                new Supplier(id, name, contact, email)
        );
    }

    static void searchSupplier() {

        int id = InputValidator.getInt(
                sc, "Enter supplier ID: "
        );

        Supplier s = supplierService.search(id);

        if (s == null) {
            System.out.println("Supplier not found.");
            return;
        }

        System.out.println("\nSupplier Found!");
        System.out.println("ID      : " + s.getId());
        System.out.println("Name    : " + s.getName());
        System.out.println("Contact : " + s.getContact());
        System.out.println("Email   : " + s.getEmail());
    }

    static void updateSupplier() {

        int id = InputValidator.getInt(
                sc, "Enter supplier ID: "
        );

        if (supplierService.search(id) == null) {
            System.out.println("Supplier not found.");
            return;
        }

        System.out.print("Enter new name: ");
        String name = sc.nextLine();

        System.out.print("Enter new contact: ");
        String contact = sc.nextLine();

        System.out.print("Enter new email: ");
        String email = sc.nextLine();

        supplierService.update(
                id, name, contact, email
        );
    }

    static void stockMenu() {

        while (true) {

            System.out.println("\n========== STOCK MANAGEMENT ==========");
            System.out.println("1. Stock IN");
            System.out.println("2. Stock OUT");
            System.out.println("3. Check Stock");
            System.out.println("4. Low Stock Products");
            System.out.println("5. Back");

            int choice = InputValidator.getInt(
                    sc, "Enter your choice: "
            );

            switch (choice) {

                case 1:
                    stockIn();
                    break;

                case 2:
                    stockOut();
                    break;

                case 3:
                    productService.view();
                    break;

                case 4:
                    stockService.showLowStock(
                            productService.getProducts()
                    );
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void stockIn() {

        int id = InputValidator.getInt(
                sc, "Enter product ID: "
        );

        Product p = productService.search(id);

        if (p == null) {
            System.out.println("Product not found.");
            return;
        }

        int quantity = InputValidator.getInt(
                sc, "Enter quantity received: "
        );

        if (quantity <= 0) {
            System.out.println("Quantity must be positive.");
            return;
        }

        stockService.stockIn(p, quantity);
        productService.save();
    }

    static void stockOut() {

        int id = InputValidator.getInt(
                sc, "Enter product ID: "
        );

        Product p = productService.search(id);

        if (p == null) {
            System.out.println("Product not found.");
            return;
        }

        int quantity = InputValidator.getInt(
                sc, "Enter quantity issued: "
        );

        if (quantity <= 0) {
            System.out.println("Quantity must be positive.");
            return;
        }

        stockService.stockOut(p, quantity);
        productService.save();
    }

    static void showLowStockWarning() {

        for (Product p : productService.getProducts()) {

            if (p.getQuantity() <= p.getReorderLevel()) {

                System.out.println(
                        "WARNING: " + p.getName()
                        + " is below reorder threshold!"
                );
            }
        }
    }

    static void reports() {

        int totalProducts = productService.getProducts().size();
        int totalStock = 0;
        int lowStock = 0;
        double inventoryValue = 0;

        for (Product p : productService.getProducts()) {

            totalStock += p.getQuantity();

            inventoryValue +=
                    p.getPrice() * p.getQuantity();

            if (p.getQuantity() <= p.getReorderLevel()) {
                lowStock++;
            }
        }

        System.out.println("\n================ REPORTS ================");
        System.out.println("Total Products    : " + totalProducts);
        System.out.println("Total Stock Units : " + totalStock);
        System.out.println("Low Stock Products: " + lowStock);
        System.out.printf(
                "Inventory Value    : ₹%.2f%n",
                inventoryValue
        );
    }
}
