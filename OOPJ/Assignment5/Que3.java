class Que3 {

    static <T extends Number> void calculate(T[] data) {
        double sum = 0;

        for (T num : data) {
            sum += num.doubleValue();
        }

        double avg = sum / data.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {

        Integer[] a = {10, 20, 30};
        Double[] b = {10.5, 20.5, 30.5};

        calculate(a);
        calculate(b);
    }
}