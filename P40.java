// 40	Write a java program to demonstrate the way contents are read from a file. (classic I/O)
import java.io.*;
public class P40 {
    public static void main(String[] args) throws Exception {
        File f = new File(args.length>0? args[0] : "t36.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String s;
        while ((s = br.readLine()) != null) System.out.println(s);
        br.close();

        // show as bytes (via FileInputStream)
        FileInputStream fis = new FileInputStream(f);
        byte[] b = new byte[(int) f.length()];
        fis.read(b);
        fis.close();
        System.out.println("---as bytes---");
        System.out.println(new String(b));
    }
}
