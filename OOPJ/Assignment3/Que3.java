class Account {
    int accNo;
    String name;
    double balance;
    static int count = 0;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        count++;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        }
    }

    void display() {
        System.out.println(accNo + " " + name + " " + balance);
    }
}

class Que3 {
    public static void main(String[] args) {
        Account a = new Account(101, "Rahul", 5000);
        a.deposit(2000);
        a.withdraw(1000);
        a.display();
        System.out.println("Total Accounts: " + Account.count);
    }
}