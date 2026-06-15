import java.util.*;

public class InventoryManager {

    HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
        System.out.println("Product Added");
    }

    public void updateProduct(int id, String name, int quantity, double price) {

        Product product = products.get(id);

        if (product != null) {
            product.setName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product Updated");
        } else {
            System.out.println("Product Not Found");
        }
    }

    public void deleteProduct(int id) {

        if (products.remove(id) != null) {
            System.out.println("Product Deleted");
        } else {
            System.out.println("Product Not Found");
        }
    }

    public void showProducts() {

        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}