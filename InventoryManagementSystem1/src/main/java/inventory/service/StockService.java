package inventory.service;

import inventory.model.Product;
import inventory.model.StockTransaction;
import inventory.util.FileManager;

import java.util.ArrayList;

public class StockService {

    private ArrayList<StockTransaction> transactions;
    private final String FILE = "data/transactions.dat";

    public StockService() {
        transactions = FileManager.load(FILE);
    }

    public void stockIn(Product p, int quantity) {

        int old = p.getQuantity();
        p.setQuantity(old + quantity);

        addTransaction(p.getId(), "IN", quantity);

        System.out.println("Stock updated successfully!");
        System.out.println("Previous quantity: " + old);
        System.out.println("Added quantity   : " + quantity);
        System.out.println("Current quantity  : " + p.getQuantity());

        checkWarning(p);
    }

    public void stockOut(Product p, int quantity) {

        if (quantity > p.getQuantity()) {
            System.out.println("Insufficient stock!");
            System.out.println("Available quantity: " + p.getQuantity());
            return;
        }

        int old = p.getQuantity();
        p.setQuantity(old - quantity);

        addTransaction(p.getId(), "OUT", quantity);

        System.out.println("Stock updated successfully!");
        System.out.println("Previous quantity: " + old);
        System.out.println("Issued quantity  : " + quantity);
        System.out.println("Current quantity  : " + p.getQuantity());

        checkWarning(p);
    }

    private void addTransaction(int productId, String type, int quantity) {

        int id = transactions.size() + 1;

        transactions.add(
            new StockTransaction(id, productId, type, quantity)
        );

        FileManager.save(FILE, transactions);
    }

    public void checkWarning(Product p) {

        if (p.getQuantity() <= p.getReorderLevel()) {

            System.out.println();
            System.out.println("WARNING: Product is below reorder threshold!");
            System.out.println("Product      : " + p.getName());
            System.out.println("Current Stock: " + p.getQuantity());
            System.out.println("Reorder Level: " + p.getReorderLevel());
        }
    }

    public void showLowStock(ArrayList<Product> products) {

        boolean found = false;

        System.out.println("\n========== LOW STOCK PRODUCTS ==========");

        for (Product p : products) {

            if (p.getQuantity() <= p.getReorderLevel()) {

                found = true;

                System.out.println("ID           : " + p.getId());
                System.out.println("Product      : " + p.getName());
                System.out.println("Current Stock: " + p.getQuantity());
                System.out.println("Reorder Level: " + p.getReorderLevel());
                System.out.println("----------------------------------------");
            }
        }

        if (!found) {
            System.out.println("No low-stock products.");
        }
    }

    public void showTransactions() {

        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        System.out.println("\n========== TRANSACTION HISTORY ==========");

        for (StockTransaction t : transactions) {

            System.out.println(
                "ID: " + t.getId() +
                " | Product ID: " + t.getProductId() +
                " | Type: " + t.getType() +
                " | Quantity: " + t.getQuantity() +
                " | Date: " + t.getDate()
            );
        }
    }
}