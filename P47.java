// P47 Thread Programming 4	Odd and Even threads printing 1..50

public class P47 {

    static final Object L = new Object();
    static int n = 1;

    static class Odd implements Runnable {

        public void run() {
            while (true) {
                synchronized (L) {
                    if (n > 50) {
                        L.notifyAll();
                        break;
                    }
                    if (n % 2 == 1) {
                        System.out.println("Odd:" + n++);
                        L.notify();
                    } else try {
                        L.wait();
                    } catch (Exception e) {
                    }
                }
            }
        }
    }

    static class Even implements Runnable {

        public void run() {
            while (true) {
                synchronized (L) {
                    if (n > 50) {
                        L.notifyAll();
                        break;
                    }
                    if (n % 2 == 0) {
                        System.out.println("Even:" + n++);
                        L.notify();
                    } else try {
                        L.wait();
                    } catch (Exception e) {
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Odd()).start();
        new Thread(new Even()).start();
    }
}
