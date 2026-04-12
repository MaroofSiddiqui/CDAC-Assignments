class Course {
    int id;
    String name;
    double fees;
    static int count = 0;

    Course(int id, String name, double fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        count++;
    }
}

class Que9 {
    public static void main(String[] args) {
        Course c1 = new Course(1, "Java", 5000);
        Course c2 = new Course(2, "Python", 4000);
        System.out.println("Total Courses: " + Course.count);
    }
}