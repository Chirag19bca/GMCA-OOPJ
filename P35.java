// 35	Write a program for Java Generics class for Sorting operations.

import java.util.*;

public class P35 {

    // Sort in natural order (ascending)
    static <T extends Comparable<T>> void sortNatural(List<T> list) {
        Collections.sort(list);
    }

    // Sort in reverse order (descending)
    static <T extends Comparable<T>> void sortReverse(List<T> list) {
        Collections.sort(list, Collections.reverseOrder());
    }

    // Sort using a Comparator
    static <T> void sortBy(List<T> list, Comparator<T> cmp) {
        Collections.sort(list, cmp);
    }

    // Custom class
    static class Person implements Comparable<Person> {
        String name;
        int age;

        Person(String n, int a) {
            name = n;
            age = a;
        }

        // Natural order → alphabetical by name
        public int compareTo(Person o) {
            return name.compareTo(o.name);
        }

        public String toString() {
            return name + "(" + age + ")";
        }
    }

    public static void main(String[] args) {

        // Sorting integers
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 1, 4, 2));
        sortNatural(nums);
        System.out.println("Natural: " + nums);

        sortReverse(nums);
        System.out.println("Reverse: " + nums);

        // Sorting custom Person objects
        List<Person> ps = new ArrayList<>();
        ps.add(new Person("janvi", 25));
        ps.add(new Person("arman", 30));
        ps.add(new Person("shiva", 20));

        sortNatural(ps);  // natural order = by name
        System.out.println("By name: " + ps);

        sortBy(ps, (a, b) -> a.age - b.age); // custom comparator
        System.out.println("By age: " + ps);
    }
}
