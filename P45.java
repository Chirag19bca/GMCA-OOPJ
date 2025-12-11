// P45 Thread Programming 2	Write a program to implement the concept of threading by implementing “Runnable” Interface.

public class P45 {

    static class R implements Runnable {

        String n;

        R(String n) {
            this.n = n;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(n + ":" + i);
                try {
                    Thread.sleep(80);
                } catch (Exception e) {
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new R("X")).start();
        new Thread(new R("Y")).start();
    }
}
