import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];


        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            int price = scanner.nextInt();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }


        int highestPricePid = findHighestPricePid(products);
        System.out.println("Product ID with the highest price: " + highestPricePid);


        int totalAmount = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close(); // Close the scanner resource
    }


    public static int findHighestPricePid(Product[] products) {
        int highestPricePid = products[0].pid;
        int highestPrice = products[0].price;

        for (Product product : products) {
            if (product.price > highestPrice) {
                highestPrice = product.price;
                highestPricePid = product.pid;
            }
        }
        return highestPricePid;
    }


    public static int calculateTotalAmountSpent(Product[] products) {
        int totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.price * product.quantity;
        }
        return totalAmount;
    }


    static class Product {
        int pid;
        int price;
        int quantity;


        public Product(int pid, int price, int quantity) {
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }
    }
}
