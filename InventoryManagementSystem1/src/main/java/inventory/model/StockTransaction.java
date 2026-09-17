package inventory.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class StockTransaction implements Serializable {

    private int id;
    private int productId;
    private String type;
    private int quantity;
    private String date;

    public StockTransaction(int id, int productId, String type, int quantity) {
        this.id = id;
        this.productId = productId;
        this.type = type;
        this.quantity = quantity;
        this.date = LocalDateTime.now().toString();
    }

    public int getId() {
        return id;
    }

    public int getProductId() {
        return productId;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDate() {
        return date;
    }
}