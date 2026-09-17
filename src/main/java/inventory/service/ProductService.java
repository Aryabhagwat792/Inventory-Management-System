package inventory.service;

import inventory.model.Product;
import inventory.util.FileManager;

import java.util.ArrayList;

public class ProductService {

    private ArrayList<Product> products;
    private final String FILE = "data/products.dat";

    public ProductService() {
        products = FileManager.load(FILE);
    }

    public void add(Product p) {
        products.add(p);
        save();
        System.out.println("Product added successfully!");
    }

    public void view() {
        if (products.isEmpty()) {
            System.out.println("No products found.");
            return;
        }

        System.out.println("\n---------------- PRODUCTS ----------------");

        for (Product p : products) {
            System.out.println(
                "ID: " + p.getId() +
                " | Name: " + p.getName() +
                " | Category: " + p.getCategory() +
                " | Price: " + p.getPrice() +
                " | Quantity: " + p.getQuantity()
            );
        }
    }

    public Product search(int id) {
        for (Product p : products) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public void update(int id, String name, String category,
                       double price, int quantity,
                       int reorderLevel, int supplierId) {

        Product p = search(id);

        if (p == null) {
            System.out.println("Product not found.");
            return;
        }

        p.setName(name);
        p.setCategory(category);
        p.setPrice(price);
        p.setQuantity(quantity);
        p.setReorderLevel(reorderLevel);
        p.setSupplierId(supplierId);

        save();
        System.out.println("Product updated successfully!");
    }

    public void delete(int id) {
        Product p = search(id);

        if (p == null) {
            System.out.println("Product not found.");
            return;
        }

        products.remove(p);
        save();
        System.out.println("Product deleted successfully!");
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void save() {
        FileManager.save(FILE, products);
    }
}