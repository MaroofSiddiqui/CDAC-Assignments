class Product {
    int id;
    String name;
    double price;
    int qty;

    Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    double totalValue() {
        return price * qty;
    }

    void updatePrice(double p) {
        price = p;
    }

    void updatePrice(double p, double discount) {
        price = p - discount;
    }
}

class Que5 {
    public static void main(String[] args) {
        Product p = new Product(1, "Laptop", 50000, 2);
        System.out.println("Total Value: " + p.totalValue());
        p.updatePrice(45000, 2000);
        System.out.println("Updated Value: " + p.totalValue());
    }
}