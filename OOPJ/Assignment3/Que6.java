class Book {
    int id;
    String title;
    boolean available = true;
    static int count = 0;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        count++;
    }

    void issue() {
        if (available) {
            available = false;
        }
    }

    void returnBook() {
        available = true;
    }
}

class Que6 {
    public static void main(String[] args) {
        Book b = new Book(1, "Java");
        b.issue();
        System.out.println("Issued: " + !b.available);
        b.returnBook();
        System.out.println("Available: " + b.available);
        System.out.println("Total Books: " + Book.count);
    }
}