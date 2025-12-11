// 53	Sort Student LinkedList based on std_name using Comparator.

import java.util.*;

public class P53 {

    static class S {

        int id;
        String name;
        int tot;

        S(int id, String name, int... m) {
            this.id = id;
            this.name = name;
            for (int x : m) {
                tot += x;
        
            }}

        public String toString() {
            return id + " " + name + " tot=" + tot;
        }
    }

    public static void main(String[] args) {
        LinkedList<S> L = new LinkedList<>();
        L.add(new S(1, "Zara", 70));
        L.add(new S(2, "Alan", 60));
        L.add(new S(3, "Bob", 80));
        System.out.println("Before: " + L);
        L.sort(Comparator.comparing(s -> s.name));
        System.out.println("After: " + L);
    }
}
