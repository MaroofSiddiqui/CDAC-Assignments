import java.util.*;

interface BankService {
    void deposit(double amount);
    void withdraw(double amount);
}

class Account {
    int accountNumber;
    String name;
    double balance;

    Account(int accNo, String name, String balance) {
        this.accountNumber = accNo;
        this.name = name;
        this.balance = Double.parseDouble(balance);
    }

    void displayAccountDetails() {
        System.out.println(accountNumber + " " + name + " Balance: " + balance);
    }
}

class SavingsAccount extends Account implements BankService {

    SavingsAccount(int accNo, String name, String balance) {
        super(accNo, name, balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(double amount, double bonus) {
        balance += amount + bonus;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayAccountDetails() {
        System.out.println("Savings Account");
        super.displayAccountDetails();
    }
}

class CurrentAccount extends Account implements BankService {

    CurrentAccount(int accNo, String name, String balance) {
        super(accNo, name, balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayAccountDetails() {
        System.out.println("Current Account");
        super.displayAccountDetails();
    }
}

class Que2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter balance: ");
            String bal = sc.nextLine();

            SavingsAccount acc = new SavingsAccount(accNo, name, bal);

            acc.deposit(1000);
            acc.deposit(500, 100);

            acc.withdraw(300);

            acc.displayAccountDetails();

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}