import java.util.*;

class Product {
    int productId;
    String productName;
    String price;

    Product(int id, String name, String price) {
        this.productId = id;
        this.productName = name;
        this.price = price;
    }

    double getPrice() {
        return Double.parseDouble(price);
    }
}

class Order {
    String customerName;
    Product[] products;

    Order(String name, Product[] products) {
        this.customerName = name;
        this.products = products;
    }

    double calculateTotal() {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        return sum;
    }

    double calculateTotal(double discount) {
        double total = calculateTotal();
        return total - (total * discount / 100);
    }

    String generateBill(double amount) {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(customerName).append("\n");

        for (Product p : products) {
            sb.append(p.productName).append(" - ").append(p.getPrice()).append("\n");
        }

        sb.append("Total: ").append(amount);
        return sb.toString();
    }
}

interface Payment {
    void pay(double amount);
    void refund(double amount);
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Refund via UPI: " + amount);
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via Card: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Refund via Card: " + amount);
    }
}

class Que1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of products: ");
            int n = sc.nextInt();
            sc.nextLine();

            if (n <= 0) {
                throw new Exception("Invalid product count");
            }

            Product[] products = new Product[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Product Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                String price = sc.nextLine();

                products[i] = new Product(i + 1, name, price);
            }

            System.out.print("Enter customer name: ");
            String cname = sc.nextLine();

            Order order = new Order(cname, products);

            double total = order.calculateTotal();

            System.out.println(order.generateBill(total));

            System.out.print("Choose payment (1-UPI / 2-Card): ");
            int choice = sc.nextInt();

            Payment payment;

            if (choice == 1) {
                payment = new UPIPayment();
            } else if (choice == 2) {
                payment = new CardPayment();
            } else {
                throw new Exception("Invalid payment option");
            }

            payment.pay(total);

        } catch (NumberFormatException e) {
            System.out.println("Invalid price format");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}