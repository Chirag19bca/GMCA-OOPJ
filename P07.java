
import java.util.Scanner;

public class P07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter fourth number: ");
        int num4 = scanner.nextInt();

        int max = Math.max(Math.max(num1, num2), Math.max(num3, num4));

        System.out.println("Maximum number is: " + max);
    }
}
