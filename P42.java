// 42	Write a generic method to count the number of elements in a collection that have a specific property.

import java.util.*;
import java.util.function.*;

public class P42 {

    static <T> long cnt(Collection<T> c, Predicate<T> p) {
        return c.stream().filter(p).count();
    }

    static boolean prime(int n) {
        if (n < 2) {
            return false;
        
        }for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
        
            }
        }return true;
    }

    public static void main(String[] args) {
        List<Integer> L = Arrays.asList(1, 2, 3, 5, 8, 11);
        System.out.println("Odds: " + cnt(L, x -> x % 2 != 0));
        System.out.println("Primes: " + cnt(L, x -> prime(x)));
        List<String> S = Arrays.asList("madam", "hi", "aa");
        System.out.println("Palindromes: " + cnt(S, s -> s.equals(new StringBuilder(s).reverse().toString())));
    }
}
