package inventory.model;

import java.io.Serializable;

public class Product implements Serializable {

    private int id;
    private String name;
    private String category;
    private double price;
    private int quantity;
    private int reorderLevel;
    private int supplierId;

    public Product(int id, String name, String category, double price,
                   int quantity, int reorderLevel, int supplierId) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
        this.supplierId = supplierId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
}