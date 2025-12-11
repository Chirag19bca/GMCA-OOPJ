// 38	Write a java program to checks the existence of a specified file. (classic I/O)
import java.io.*;
public class P38 {
    public static void main(String[] args) {
        String path = args.length>0? args[0] : "t36.txt";
        File f = new File(path);
        System.out.println(path + " exists? " + f.exists());
    }
}
