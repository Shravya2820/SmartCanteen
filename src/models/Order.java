package models;

public class Order {
    private String itemName;
    private int quantity;
    private double totalPrice;

    public Order(String itemName, int quantity, double pricePerItem) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.totalPrice = quantity * pricePerItem;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return itemName + " x " + quantity + " = ₹" + totalPrice;
    }
}
