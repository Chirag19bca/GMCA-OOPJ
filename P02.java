import java.util.Scanner;

class P02 {

    public static void fib(int n1, int n2) {
        int i,j;
        System.out.println("Fibonacci numbers: " );
        for(i=n1;i<n2;i++)
        {
            
        }

    }

    public static void prime(int n1, int n2) {
        int i, j;
        System.out.println("Prime numbers: " );
        for (i = n1; i < n2; i++) {

            if (i < 2)
                continue;
            boolean isPrime = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(+ i + " ");

            }
        }

    }

    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter starting point: ");
        int start = obj1.nextInt();
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter ending point: ");
        int end = obj2.nextInt();
        prime(start, end);
        fib(start, end);

    }
}