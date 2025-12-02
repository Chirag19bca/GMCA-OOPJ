import java.io.File;
import java.util.Scanner;

public class P38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name (with path if not in current folder): ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does NOT exist.");
        }

        sc.close();
    }
}
