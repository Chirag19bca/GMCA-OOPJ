import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class P39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path (including file name): ");
        String filePath = sc.nextLine();

        File file = new File(filePath);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully at: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error occurred while creating the file.");
            System.out.println("Reason: " + e.getMessage());
        }

        sc.close();
    }
}
