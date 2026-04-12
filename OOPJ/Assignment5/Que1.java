class Inventory<T> {
    private T product;

    void addProduct(T product) {
        this.product = product;
    }

    T getProduct() {
        return product;
    }
}

class Electronics {
    String name;

    Electronics(String name) {
        this.name = name;
    }

    public String toString() {
        return "Electronics: " + name;
    }
}

class Clothing {
    String name;

    Clothing(String name) {
        this.name = name;
    }

    public String toString() {
        return "Clothing: " + name;
    }
}

class Que1 {
    public static void main(String[] args) {

        Inventory<Electronics> e = new Inventory<>();
        e.addProduct(new Electronics("Laptop"));
        System.out.println(e.getProduct());

        Inventory<Clothing> c = new Inventory<>();
        c.addProduct(new Clothing("Shirt"));
        System.out.println(c.getProduct());
    }
}