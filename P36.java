// 36	Write a program in Java to create, write, modify, read operations on a Text file. (classic I/O)
import java.io.*;
import java.util.*;
public class P36 {
    static File F = new File("t36.txt");
    public static void main(String[] args) throws Exception {
        // write initial lines (overwrite)
        PrintWriter pw = new PrintWriter(new FileWriter(F));
        pw.println("one");
        pw.println("two");
        pw.println("three");
        pw.close();
        System.out.println("Wrote initial lines.");

        // read
        BufferedReader br = new BufferedReader(new FileReader(F));
        List<String> lines = new ArrayList<>();
        String s;
        while ((s = br.readLine()) != null) lines.add(s);
        br.close();
        System.out.println("Read: " + lines);

        // append
        FileWriter fw = new FileWriter(F, true);
        fw.write("four");
        fw.close();

        // modify second line
        br = new BufferedReader(new FileReader(F));
        lines.clear();
        while ((s = br.readLine()) != null) lines.add(s);
        br.close();
        if (lines.size() > 1) lines.set(1, "TWO");
        pw = new PrintWriter(new FileWriter(F));
        for (String line : lines) pw.println(line);
        pw.close();

        // final read
        br = new BufferedReader(new FileReader(F));
        lines.clear();
        while ((s = br.readLine()) != null) lines.add(s);
        br.close();
        System.out.println("Final: " + lines);
    }
}
