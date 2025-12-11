// 34	Write a program to write at least 10 objects of the Circle class in a File and to perform basic operations: adding, retrieving, updating, removing elements.
import java.io.*;
import java.util.*;
public class P34 {
    static File FILE = new File("t34.txt");

    static List<Double> readFile() throws Exception {
        List<Double> list = new ArrayList<>();
        if (!FILE.exists()) return list;
        BufferedReader br = new BufferedReader(new FileReader(FILE));
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.trim().isEmpty()) list.add(Double.parseDouble(line.trim()));
        }
        br.close();
        return list;
    }

    static void writeFile(List<Double> list) throws Exception {
        PrintWriter pw = new PrintWriter(new FileWriter(FILE));
        for (Double d : list) pw.println(d);
        pw.close();
    }

    public static void main(String[] args) throws Exception {
        List<Double> list = readFile();
        if (list.size() < 10) {
            list.clear();
            for (int i = 1; i <= 10; i++) list.add((double) i);
            writeFile(list);
            System.out.println("Initialized 10 circles.");
        }

        System.out.println("All: " + list);

        // add
        list.add(9.9);
        writeFile(list);
        System.out.println("Added 9.9");

        // retrieve index 0
        System.out.println("Index 0: " + readFile().get(0));

        // update index 1
        list = readFile();
        if (list.size() > 1) {
            list.set(1, 7.7);
            writeFile(list);
            System.out.println("Updated idx1 -> 7.7");
        }

        // remove last
        list = readFile();
        if (!list.isEmpty()) {
            double removed = list.remove(list.size() - 1);
            writeFile(list);
            System.out.println("Removed last: " + removed);
        }

        System.out.println("Final: " + readFile());
    }
}
