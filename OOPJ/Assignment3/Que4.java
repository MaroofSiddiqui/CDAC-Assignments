class Contact {
    String phone, email;

    Contact(String p, String e) {
        phone = p;
        email = e;
    }
}

class Patient {
    int id, age;
    String name, disease;
    Contact contact;
    static int count = 0;

    Patient(int id, String name, int age, String disease, Contact contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.contact = contact;
        count++;
    }

    void display() {
        String status = (age >= 60) ? "Senior" : "Normal";
        System.out.println(name + " " + disease + " " + status);
    }
}

class Que4 {
    public static void main(String[] args) {
        Contact c = new Contact("8888888888", "p@gmail.com");
        Patient p = new Patient(1, "Ravi", 65, "Fever", c);
        p.display();
        System.out.println("Total Patients: " + Patient.count);
    }
}