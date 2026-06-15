public class InventoryManagementSystem {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 10, 50000);
        Product p2 = new Product(102, "Mouse", 50, 500);

        manager.addProduct(p1);
        manager.addProduct(p2);

        System.out.println("\nInventory:");
        manager.showProducts();

        manager.updateProduct(101, "Gaming Laptop", 8, 65000);

        System.out.println("\nAfter Update:");
        manager.showProducts();

        manager.deleteProduct(102);

        System.out.println("\nAfter Delete:");
        manager.showProducts();
    }
}