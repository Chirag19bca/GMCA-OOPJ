// P46 Thread Programming 3	Two threads: one prints every 2000ms, other every 4000ms.

public class P46 {

    static class P implements Runnable {

        String m;
        int t;

        P(String m, int t) {
            this.m = m;
            this.t = t;
        }

        public void run() {
            try {
                while (true) {
                    System.out.println(m);
                    Thread.sleep(t);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new P("Thread1", 2000)).start();
        new Thread(new P("Thread2", 4000)).start();
    }
}
