// 52	Develop a program to create HashMap for Customer objects. Key = mobile no.

import java.util.*;

public class P52 {

    static class C {

        String bill, mobile;
        double total;

        C(String bill, String m, String[] items, double[] price, int[] cnt) {
            this.bill = bill;
            this.mobile = m;
            for (int i = 0; i < price.length; i++) {
                total += price[i] * cnt[i];
        
            }}

        public String toString() {
            return bill + " mobile=" + mobile + " total=" + total;
        }
    }

    public static void main(String[] args) {
        Map<String, C> M = new HashMap<>();
        M.put("9998887770", new C("B1", "9998887770", new String[]{"Apple"}, new double[]{30}, new int[]{2}));
        M.put("8887776660", new C("B2", "8887776660", new String[]{"Milk"}, new double[]{40}, new int[]{1}));
        System.out.println("All: " + M);
        String q = args.length > 0 ? args[0] : "9998887770";
        System.out.println("Find: " + M.get(q));
    }
}
