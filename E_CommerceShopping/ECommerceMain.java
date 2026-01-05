package E_CommerceShopping;

import java.util.ArrayList;

/**
 * Main class to demonstrate the E-Commerce Shopping Cart System.
 * 
 * @author E-Commerce Team
 * @version 1.0
 */
public class ECommerceMain {
    /**
     * Main method to run the e-commerce system demo.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== E-Commerce Shopping Cart System ===\n");

        // Create products
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("P001", "Laptop", 899.99, 10));
        products.add(new Product("P002", "Smartphone", 599.99, 15));
        products.add(new Product("P003", "Headphones", 79.99, 25));
        products.add(new Product("P004", "Keyboard", 49.99, 30));
        products.add(new Product("P005", "Mouse", 29.99, 50));

        // Create and register a customer
        System.out.println("--- Customer Registration ---");
        Customer customer1 = new Customer("C001", "Alice Johnson", "alice@email.com", "password123");
        customer1.register();

        // Customer views products (before login)
        System.out.println("\n--- Browsing Products ---");
        customer1.viewProducts(products);

        // Customer tries to add to cart without logging in
        System.out.println("\n--- Attempting to Add to Cart (Not Logged In) ---");
        customer1.addToCart(products.get(0), 1);

        // Customer logs in
        System.out.println("\n--- Customer Login ---");
        customer1.login("alice@email.com", "password123");

        // Customer adds products to cart
        System.out.println("\n--- Adding Products to Cart ---");
        customer1.addToCart(products.get(0), 1); // Laptop
        customer1.addToCart(products.get(2), 2); // Headphones
        customer1.addToCart(products.get(4), 3); // Mouse

        // View cart
        System.out.println("\n--- Viewing Cart ---");
        customer1.getCart().viewCartItems();

        // Update quantity (add more of the same product)
        System.out.println("\n--- Adding More Headphones ---");
        customer1.addToCart(products.get(2), 1); // Add 1 more headphone

        // View updated cart
        System.out.println("\n--- Updated Cart ---");
        customer1.getCart().viewCartItems();

        // Remove a product
        System.out.println("\n--- Removing Mouse from Cart ---");
        customer1.getCart().removeProduct(products.get(4));

        // View cart after removal
        System.out.println("\n--- Cart After Removal ---");
        customer1.getCart().viewCartItems();

        // Check product availability
        System.out.println("\n--- Checking Product Availability ---");
        Product laptop = products.get(0);
        System.out.println(laptop.getName() + " availability: " + laptop.checkAvailability());
        System.out.println("Can purchase 5 units? " + laptop.checkAvailability(5));
        System.out.println("Can purchase 20 units? " + laptop.checkAvailability(20));

        // Proceed to checkout
        System.out.println("\n--- Proceeding to Checkout ---");
        customer1.checkout();

        // Verify cart is empty after checkout
        System.out.println("\n--- Cart After Checkout ---");
        customer1.getCart().viewCartItems();
    }
}
