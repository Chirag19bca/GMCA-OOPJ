// 39	Write a java program to create a file to the specified location. (classic I/O)
import java.io.*;
public class P39 {
    public static void main(String[] args) throws Exception {
        File f = new File(args.length>0? args[0] : "new.txt");
        if (f.exists()) System.out.println("Exists: " + f.getAbsolutePath());
        else {
            File parent = f.getParentFile();
            if (parent != null && !parent.exists()) parent.mkdirs();
            f.createNewFile();
            System.out.println("Created: " + f.getAbsolutePath());
        }
    }
}
