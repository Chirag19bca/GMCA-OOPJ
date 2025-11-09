
public class P11 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(0);
            return;
        }
        String s = args[0];
        int letters = 0, digits = 0;
        System.out.println("String: " + s);
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                digits++;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
    }
}
