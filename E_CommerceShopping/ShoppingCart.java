package E_CommerceShopping;

import java.util.HashMap;
import java.util.Map;

/**
 * ShoppingCart class represents a customer's shopping cart.
 * 
 * @author E-Commerce Team
 * @version 1.0
 */
public class ShoppingCart {
    private HashMap<Product, Integer> cartItems;
    private double totalPrice;

    /**
     * Constructor to create an empty ShoppingCart.
     */
    public ShoppingCart() {
        this.cartItems = new HashMap<>();
        this.totalPrice = 0.0;
    }

    /**
     * Adds a product to the cart.
     * 
     * @param product The product to add
     * @param quantity Quantity of the product to add
     */
    public void addProduct(Product product, int quantity) {
        if (!product.checkAvailability(quantity)) {
            System.out.println("Sorry, only " + product.getStockQuantity() + " units available for " + product.getName());
            return;
        }

        if (cartItems.containsKey(product)) {
            int currentQuantity = cartItems.get(product);
            cartItems.put(product, currentQuantity + quantity);
            System.out.println("Updated quantity of " + product.getName() + " in cart.");
        } else {
            cartItems.put(product, quantity);
            System.out.println("Added " + quantity + " x " + product.getName() + " to cart.");
        }
        
        calculateTotalPrice();
    }

    /**
     * Removes a product from the cart.
     * 
     * @param product The product to remove
     */
    public void removeProduct(Product product) {
        if (cartItems.containsKey(product)) {
            cartItems.remove(product);
            System.out.println(product.getName() + " removed from cart.");
            calculateTotalPrice();
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    /**
     * Calculates the total price of all items in the cart.
     */
    public void calculateTotalPrice() {
        totalPrice = 0.0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            totalPrice += product.getPrice() * quantity;
        }
    }

    /**
     * Displays all items in the cart.
     */
    public void viewCartItems() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("\n=== Shopping Cart ===");
        System.out.println("--------------------------------------------------");
        
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            double itemTotal = product.getPrice() * quantity;
            
            System.out.println(product.getName() + " x " + quantity);
            System.out.println("  Price: $" + product.getPrice() + " each");
            System.out.println("  Subtotal: $" + itemTotal);
            System.out.println("--------------------------------------------------");
        }
        
        System.out.println("Total Price: $" + totalPrice);
    }

    /**
     * Gets the cart items.
     * 
     * @return HashMap of products and their quantities
     */
    public HashMap<Product, Integer> getCartItems() {
        return cartItems;
    }

    /**
     * Gets the total price.
     * 
     * @return The total price of items in cart
     */
    public double getTotalPrice() {
        return totalPrice;
    }
}
