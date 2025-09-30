
import java.util.Scanner;

class P04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, n = 0;
        System.out.print("Enter Base(X) : ");
        x = sc.nextInt();
        System.out.print("Enter Exponent(n) : ");
        n = sc.nextInt();
        int power = 1, i;
        for (i = 1; i <= n; i++) {
            power = power * x;
        }
        System.out.println("\n Output : " + power);
        sc.close();
    }
}
