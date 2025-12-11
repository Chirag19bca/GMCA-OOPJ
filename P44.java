// P44 Thread Programming 1	Write a program to implement the concept of threading by extending “Thread” Class.

public class P44 {

    static class T extends Thread {

        T(String n) {
            super(n);
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + ":" + i);
                try {
                    sleep(100);
                } catch (Exception e) {
                }
            }
        }
    }

    public static void main(String[] args) {
        new T("A").start();
        new T("B").start();
    }
}
