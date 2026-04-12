class TicketSystem {
    int tickets = 5;

    synchronized void book(String name) {
        if (tickets > 0) {
            System.out.println(name + " booked ticket");
            tickets--;
        } else {
            System.out.println(name + " failed");
        }
    }
}

class UserThread implements Runnable {

    TicketSystem ts;
    String name;

    UserThread(TicketSystem ts, String name) {
        this.ts = ts;
        this.name = name;
    }

    public void run() {
        ts.book(name);
    }
}

class Que5 {
    public static void main(String[] args) {

        TicketSystem ts = new TicketSystem();

        for (int i = 1; i <= 10; i++) {
            Thread t = new Thread(new UserThread(ts, "User" + i));
            t.start();
        }
    }
}