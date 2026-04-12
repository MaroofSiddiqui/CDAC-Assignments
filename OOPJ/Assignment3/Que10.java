class Ticket {
    int id;
    String name, src, dest;
    double fare;

    Ticket(int id, String name, String src, String dest, double fare) {
        this.id = id;
        this.name = name;
        this.src = src;
        this.dest = dest;
        this.fare = fare;
    }

    void display() {
        System.out.println(name + " " + src + " -> " + dest + " Fare: " + fare);
    }
}

class Que10 {
    public static void main(String[] args) {
        Ticket t = new Ticket(1, "Ali", "Delhi", "Mumbai", 1500);
        t.display();
    }
}