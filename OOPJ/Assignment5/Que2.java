class Que2 {

    static <T> void printReport(T[] data) {
        for (T item : data) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        Integer[] sales = {100, 200, 300};
        String[] names = {"Amit", "Rahul", "Neha"};

        printReport(sales);
        printReport(names);
    }
}