package E_CommerceShopping;

import java.util.ArrayList;

/**
 * Customer class represents a customer in the e-commerce system.
 * 
 * @author E-Commerce Team
 * @version 1.0
 */
public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String password;
    private ShoppingCart cart;
    private boolean isLoggedIn;

    /**
     * Constructor to create a Customer object.
     * 
     * @param customerId Unique identifier for the customer
     * @param name Name of the customer
     * @param email Email address of the customer
     * @param password Password for the customer account
     */
    public Customer(String customerId, String name, String email, String password) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cart = new ShoppingCart();
        this.isLoggedIn = false;
    }

    /**
     * Registers a new customer account.
     */
    public void register() {
        System.out.println("Customer registered successfully!");
        System.out.println("Welcome, " + name + "!");
        System.out.println("Email: " + email);
    }

    /**
     * Logs in the customer.
     * 
     * @param email Email address
     * @param password Password
     * @return true if login successful, false otherwise
     */
    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            isLoggedIn = true;
            System.out.println("Login successful! Welcome back, " + name + "!");
            return true;
        } else {
            System.out.println("Invalid credentials. Please try again.");
            return false;
        }
    }

    /**
     * Views available products.
     * 
     * @param products List of products to display
     */
    public void viewProducts(ArrayList<Product> products) {
        System.out.println("\n=== Available Products ===");
        for (Product product : products) {
            product.getDetails();
            System.out.println();
        }
    }

    /**
     * Adds a product to the shopping cart.
     * 
     * @param product The product to add
     * @param quantity Quantity of the product
     */
    public void addToCart(Product product, int quantity) {
        if (!isLoggedIn) {
            System.out.println("Please login first to add items to cart.");
            return;
        }
        cart.addProduct(product, quantity);
    }

    /**
     * Proceeds to checkout.
     */
    public void checkout() {
        if (!isLoggedIn) {
            System.out.println("Please login first to checkout.");
            return;
        }
        
        if (cart.getCartItems().isEmpty()) {
            System.out.println("Your cart is empty. Add items before checkout.");
            return;
        }

        System.out.println("\n=== Checkout ===");
        cart.viewCartItems();
        System.out.println("\nOrder placed successfully!");
        System.out.println("Thank you for shopping with us, " + name + "!");
        cart = new ShoppingCart(); // Clear cart after checkout
    }

    /**
     * Gets the customer's shopping cart.
     * 
     * @return The shopping cart
     */
    public ShoppingCart getCart() {
        return cart;
    }

    // Getters
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public boolean isLoggedIn() { return isLoggedIn; }
}
