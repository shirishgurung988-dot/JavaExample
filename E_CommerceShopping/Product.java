package E_CommerceShopping;

/**
 * Product class represents a product in the e-commerce system.
 * 
 * @author E-Commerce Team
 * @version 1.0
 */
public class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;

    /**
     * Constructor to create a Product object.
     * 
     * @param productId Unique identifier for the product
     * @param name Name of the product
     * @param price Price of the product
     * @param stockQuantity Available stock quantity
     */
    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    /**
     * Displays the details of the product.
     */
    public void getDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stockQuantity + " units");
        System.out.println("Availability: " + (checkAvailability() ? "In Stock" : "Out of Stock"));
    }

    /**
     * Checks if the product is available in stock.
     * 
     * @return true if product is available, false otherwise
     */
    public boolean checkAvailability() {
        return stockQuantity > 0;
    }

    /**
     * Checks if a specific quantity is available.
     * 
     * @param quantity Quantity to check
     * @return true if quantity is available, false otherwise
     */
    public boolean checkAvailability(int quantity) {
        return stockQuantity >= quantity;
    }

    /**
     * Reduces stock quantity when product is purchased.
     * 
     * @param quantity Quantity to reduce
     */
    public void reduceStock(int quantity) {
        if (quantity <= stockQuantity) {
            stockQuantity -= quantity;
        }
    }

    // Getters and Setters
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }
    
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}