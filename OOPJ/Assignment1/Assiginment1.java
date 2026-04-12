import java.util.*;

class Assignment1 {
    public static void main(String[] args) {

        // 33 Fix infinite loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // 34 Prime numbers 1 to 100
        for (int num = 2; num <= 100; num++) {
            boolean flag = true;

            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // 35 GCD
        int a = 12, b = 18;
        int x = a, y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println("GCD = " + x);

        // 36 LCM
        int max = (a > b) ? a : b;

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }

        // 37 Perfect number
        int n = 28;
        int sum = 0;

        for (int k = 1; k < n; k++) {
            if (n % k == 0) {
                sum += k;
            }
        }

        if (sum == n) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not Perfect");
        }

        // 38 Number guessing game
        Scanner sc = new Scanner(System.in);
        int number = 7;
        int guess;

        do {
            System.out.print("Enter number: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high");
            } else if (guess < number) {
                System.out.println("Too low");
            }

        } while (guess != number);

        System.out.println("Correct!");

    }
}