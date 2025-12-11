// 43	Write a generic method to exchange the positions of two different elements in an array.

import java.util.*;

public class P43 {

    static <T> void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        swap(a, 0, 2);
        System.out.println(Arrays.toString(a));
        String[] s = {"A", "B"};
        swap(s, 0, 1);
        System.out.println(Arrays.toString(s));
    }
}
