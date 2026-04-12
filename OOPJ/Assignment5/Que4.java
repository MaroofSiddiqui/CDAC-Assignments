import java.util.*;

class Payment {
    int id;
    double amount;

    Payment(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    void displayPayment() {
        System.out.println(id + " " + amount);
    }
}

class CreditCardPayment extends Payment {

    CreditCardPayment(int id, double amount) {
        super(id, amount);
    }

    void displayPayment() {
        System.out.println("CreditCard: " + id + " " + amount);
    }
}

class UPIPayment extends Payment {

    UPIPayment(int id, double amount) {
        super(id, amount);
    }

    void displayPayment() {
        System.out.println("UPI: " + id + " " + amount);
    }
}

class Que4 {

    static void showPayments(List<? extends Payment> list) {
        for (Payment p : list) {
            p.displayPayment();
        }
    }

    public static void main(String[] args) {

        List<CreditCardPayment> cardList = new ArrayList<>();
        cardList.add(new CreditCardPayment(1, 1000));
        cardList.add(new CreditCardPayment(2, 2000));

        List<UPIPayment> upiList = new ArrayList<>();
        upiList.add(new UPIPayment(3, 1500));
        upiList.add(new UPIPayment(4, 2500));

        showPayments(cardList);
        showPayments(upiList);
    }
}