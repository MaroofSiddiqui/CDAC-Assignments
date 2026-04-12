class Student {
    int rollNo;
    String name;
    int[] marks;
    String phone, email;
    static int count = 0;

    Student(int rollNo, String name, int[] marks, String phone, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.phone = phone;
        this.email = email;
        count++;
    }

    int getTotal() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum;
    }

    double getAverage() {
        return (double) getTotal() / marks.length;
    }

    void display() {
        System.out.println(rollNo + " " + name + " Total: " + getTotal() + " Avg: " + getAverage());
    }
}

class Que1 {
    public static void main(String[] args) {
        int[] marks = {80, 90, 85};
        Student s = new Student(1, "Amit", marks, "9999999999", "a@gmail.com");
        s.display();
        System.out.println("Total Students: " + Student.count);
    }
}