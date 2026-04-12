// Que2
class Vehicle {
    String brand;
    int speed;

    {
        System.out.println("Vehicle created");
    }

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println(brand + " " + speed);
    }
}

class Car extends Vehicle {
    String fuel;

    Car(String b, int s, String f) {
        super(b, s);
        fuel = f;
    }

    void display() {
        super.display();
        System.out.println("Fuel: " + fuel);
    }
}

class Bike extends Vehicle {
    int mileage;

    Bike(String b, int s, int m) {
        super(b, s);
        mileage = m;
    }

    void display() {
        super.display();
        System.out.println("Mileage: " + mileage);
    }
}

class Que2 {
    public static void main(String[] args) {
        Car c = new Car("BMW", 120, "Petrol");
        Bike b = new Bike("Yamaha", 80, 40);
        c.display();
        b.display();
    }
}