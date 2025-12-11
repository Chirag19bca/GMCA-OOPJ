// P49 Thread Programming 6	Synchronization when multiple threads update common Account

public class P49 {

    static class Account {

        int bal = 1000;

        synchronized void withdraw(int x) {
            if (bal >= x) {
                bal -= x;
                System.out.println(Thread.currentThread().getName() + " withdrew " + x + " bal=" + bal);
            } else {
                System.out.println("Insuf " + bal);
        
            }}
    }

    public static void main(String[] args) {
        Account a = new Account();
        Runnable r = () -> {
            for (int i = 0; i < 3; i++) {
                a.withdraw(400);
                try {
                    Thread.sleep(30);
                } catch (Exception e) {
                }
            }
        };
        new Thread(r, "T1").start();
        new Thread(r, "T2").start();
    }
}
