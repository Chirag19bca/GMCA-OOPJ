// 50	Develop a program to create Linked List for Student objects. Display and search by name (cmd arg).

import java.util.*;

public class P50 {

    static class S {

        int id;
        String name;
        int[] m;
        int tot;

        S(int id, String name, int... m) {
            this.id = id;
            this.name = name;
            this.m = m;
            for (int x : m) {
                tot += x;
        
            }}

        public String toString() {
            return id + " " + name + " tot=" + tot;
        }
    }

    public static void main(String[] args) {
        LinkedList<S> L = new LinkedList<>();
        L.add(new S(1, "Dhruvil", 80, 70));
        L.add(new S(2, "Manan", 60, 65));
        L.add(new S(3, "Chirag", 88, 92));
        System.out.println("All: " + L);
        String q = args.length > 0 ? args[0] : "Dhruvil";
        L.stream().filter(s -> s.name.equalsIgnoreCase(q)).forEach(System.out::println);
    }
}
