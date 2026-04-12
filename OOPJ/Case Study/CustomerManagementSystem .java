import java.util.*;
import java.time.*;

enum ServicePlan {
    SILVER(1000),
    GOLD(2000),
    DIAMOND(5000),
    PLATINUM(10000);

    private double charges;

    ServicePlan(double charges) {
        this.charges = charges;
    }

    public double getCharges() {
        return charges;
    }
}

class Customer {
    static int counter = 1;

    int id;
    String firstName, lastName, email, password;
    double regAmount;
    LocalDate dob;
    ServicePlan plan;

    Customer(String fn, String ln, String email, String pass,
             double amount, LocalDate dob, ServicePlan plan) {

        this.id = counter++;
        this.firstName = fn;
        this.lastName = ln;
        this.email = email;
        this.password = pass;
        this.regAmount = amount;
        this.dob = dob;
        this.plan = plan;
    }

    public String toString() {
        return id + " " + firstName + " " + lastName + " " +
               email + " " + plan + " " + dob;
    }
}

class CustomerException extends Exception {
    CustomerException(String msg) {
        super(msg);
    }
}

class Validation {

    static void checkDuplicate(String email, Map<String, Customer> map) throws CustomerException {
        if (map.containsKey(email))
            throw new CustomerException("Duplicate Email!");
    }

    static ServicePlan validatePlan(String plan) throws CustomerException {
        try {
            return ServicePlan.valueOf(plan.toUpperCase());
        } catch (Exception e) {
            throw new CustomerException("Invalid Plan");
        }
    }

    static void validateAmount(double amt, ServicePlan plan) throws CustomerException {
        if (amt != plan.getCharges())
            throw new CustomerException("Invalid Amount");
    }

    static void validateEmail(String email) throws CustomerException {
        if (!(email.contains("@") && (email.endsWith(".com") || email.endsWith(".org") || email.endsWith(".net"))))
            throw new CustomerException("Invalid Email");
    }

    static void validatePassword(String pass) throws CustomerException {
        if (pass.length() < 6)
            throw new CustomerException("Weak Password");
    }

    static Customer validateAll(String fn, String ln, String email, String pass,
                                double amt, String dob, String plan,
                                Map<String, Customer> map) throws CustomerException {

        checkDuplicate(email, map);
        validateEmail(email);

        ServicePlan sp = validatePlan(plan);
        validateAmount(amt, sp);

        validatePassword(pass);

        return new Customer(fn, ln, email, pass, amt, LocalDate.parse(dob), sp);
    }
}

class CustomerService {

    Map<String, Customer> map = new HashMap<>();

    void signUp(Customer c) {
        map.put(c.email, c);
    }

    Customer signIn(String email, String pass) throws CustomerException {
        Customer c = map.get(email);

        if (c == null || !c.password.equals(pass))
            throw new CustomerException("Invalid Login");

        return c;
    }

    void changePassword(String email, String oldPass, String newPass) throws CustomerException {
        Customer c = signIn(email, oldPass);
        c.password = newPass;
    }

    void unsubscribe(String email) {
        map.remove(email);
    }

    void displayAll() {
        for (Customer c : map.values()) {
            System.out.println(c);
        }
    }
}

public class CustomerManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CustomerService service = new CustomerService();

        while (true) {
            System.out.println("\n1.SignUp 2.SignIn 3.ChangePass 4.Unsubscribe 5.Display 0.Exit");
            int ch = sc.nextInt();

            try {
                switch (ch) {

                    case 1:
                        System.out.println("Enter fn ln email pass amount dob(yyyy-mm-dd) plan:");
                        Customer c = Validation.validateAll(
                                sc.next(), sc.next(), sc.next(), sc.next(),
                                sc.nextDouble(), sc.next(), sc.next(),
                                service.map);
                        service.signUp(c);
                        System.out.println("Registered: " + c);
                        break;

                    case 2:
                        System.out.println("Enter email pass:");
                        System.out.println("Welcome: " +
                                service.signIn(sc.next(), sc.next()));
                        break;

                    case 3:
                        System.out.println("Enter email oldPass newPass:");
                        service.changePassword(sc.next(), sc.next(), sc.next());
                        System.out.println("Password Updated");
                        break;

                    case 4:
                        System.out.println("Enter email:");
                        service.unsubscribe(sc.next());
                        System.out.println("Removed");
                        break;

                    case 5:
                        service.displayAll();
                        break;

                    case 0:
                        System.exit(0);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}