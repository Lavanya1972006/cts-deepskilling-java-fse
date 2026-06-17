import java.util.Scanner;

public class SortingCustomerOrders {

    // Display Orders
    public static void displayOrders(Order[] orders) {

        for (Order order : orders) {
            System.out.println(order);
        }
    }

    // Bubble Sort
    public static void bubbleSort(Order[] orders) {

        int size = orders.length;

        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - i - 1; j++) {

                if (orders[j].totalPrice > orders[j + 1].totalPrice) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Order[] orders, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(orders, low, high);

            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }

    public static int partition(Order[] orders, int low, int high) {

        double pivot = orders[high].totalPrice;

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (orders[j].totalPrice < pivot) {

                i++;

                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Details of Order " + (i + 1));

            System.out.print("Order ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Total Price: ");
            double price = sc.nextDouble();

            orders[i] = new Order(id, name, price);
        }

        Order[] bubbleOrders = orders.clone();
        Order[] quickOrders = orders.clone();

        System.out.println("\nOriginal Orders:");
        displayOrders(orders);

        bubbleSort(bubbleOrders);

        System.out.println("\nAfter Bubble Sort:");
        displayOrders(bubbleOrders);

        quickSort(quickOrders, 0, quickOrders.length - 1);

        System.out.println("\nAfter Quick Sort:");
        displayOrders(quickOrders);

    }
}