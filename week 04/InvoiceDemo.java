public class InvoiceDemo {
    public static void main(String[] args) {
        try {
            Invoice inv = new Invoice("Book", 2, 15.5);
            System.out.println(inv);
            inv.setQuantity(-1); // This will throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Invoice {
    private String item;
    private int quantity;
    private double price;

    public Invoice(String item, int quantity, double price) {
        if (quantity < 0 || price < 0) {
            throw new IllegalArgumentException("Quantity and price cannot be negative");
        }
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }
    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
    public double getTotal() { return quantity * price; }
    public String toString() {
        return "Invoice[item=" + item + ", quantity=" + quantity + ", price=" + price + "]";
    }
} 