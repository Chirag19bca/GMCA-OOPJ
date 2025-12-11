// 51	Develop a program to create ArrayList for Employee objects. Insert at position (stdin).

import java.io.*;
import java.util.*;

public class P51 {

    static class E {

        int code;
        String name;
        double basic, gross;

        E(int c, String n, double b) {
            code = c;
            name = n;
            basic = b;
            gross = b * 1.5;
        }

        public String toString() {
            return code + " " + name + " gross=" + gross;
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList<E> L = new ArrayList<>();
        L.add(new E(101, "Ravi", 10000));
        L.add(new E(102, "Sita", 12000));
        System.out.println("Before: " + L);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Index to insert (0.." + L.size() + "): ");
        int idx = Integer.parseInt(br.readLine());
        System.out.print("Enter code,name,basic: ");
        String[] p = br.readLine().split(",");
        L.add(Math.max(0, Math.min(L.size(), idx)), new E(Integer.parseInt(p[0].trim()), p[1].trim(), Double.parseDouble(p[2].trim())));
        System.out.println("After: " + L);
    }
}
