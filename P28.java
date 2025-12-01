import java.util.Scanner;

public class P28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.equals(str.toUpperCase()))
            System.out.println("String is in UPPER case.");
        else if (str.equals(str.toLowerCase()))
            System.out.println("String is in lower case.");
        else
            System.out.println("String is Mixed case.");

        StringBuilder reversed = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                reversed.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                reversed.append(Character.toUpperCase(ch));
            else
                reversed.append(ch);
        }

        System.out.println("After case reverse: " + reversed);
        sc.close();
    }
}
