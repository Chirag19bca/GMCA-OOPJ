// P48 Thread Programming 5	Run 3 threads printing A(20), B(30), C(15)

public class P48 {

    static class P implements Runnable {

        String c;
        int t;

        P(String c, int t) {
            this.c = c;
            this.t = t;
        }

        public void run() {
            for (int i = 0; i < t; i++) {
                System.out.print(c);
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new P("A", 20)).start();
        new Thread(new P("B", 30)).start();
        new Thread(new P("C", 15)).start();
    }
}
