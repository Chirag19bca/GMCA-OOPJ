// 37	Write a java program to illustrate use of standard input stream to read the user input.
import java.io.*;
public class P37 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Name: ");
        String name = r.readLine();
        System.out.print("Age: ");
        String age = r.readLine();
        System.out.println("Hi " + name + ", age " + age);
    }
}
