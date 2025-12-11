// 41	Write a java program to count the availability of text lines in the particular file. (classic I/O)

import java.io.*;

public class P41 {

    public static void main(String[] args) throws Exception {
        File f = new File(args.length > 0 ? args[0] : "t36.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        int count = 0;
        while (br.readLine() != null) {
            count++;
        }
        br.close();
        System.out.println("Lines = " + count);
    }
}
