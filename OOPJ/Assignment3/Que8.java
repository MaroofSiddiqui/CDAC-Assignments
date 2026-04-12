class Order {
    int id;
    String customer;
    double[] prices;

    Order(int id, String customer, double[] prices) {
        this.id = id;
        this.customer = customer;
        this.prices = prices;
    }

    double total() {
        double sum = 0;
        for (double p : prices) {
            sum += p;
        }
        return sum * 1.18;
    }
}

class Que8 {
    public static void main(String[] args) {
        double[] prices = {100, 200, 300};
        Order o = new Order(1, "Rohit", prices);
        System.out.println("Total Bill: " + o.total());
    }
}