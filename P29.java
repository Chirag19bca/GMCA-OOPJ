
public class P29 {

    public static void main(String[] args) {

        String s = "Java Programming";

        System.out.println("String         : " + s);
        System.out.println("Length         : " + s.length());
        System.out.println("Uppercase      : " + s.toUpperCase());
        System.out.println("Lowercase      : " + s.toLowerCase());
        System.out.println("Char At (5)    : " + s.charAt(5));
        System.out.println("Substring      : " + s.substring(5, 16));
        System.out.println("Index of 'Pro' : " + s.indexOf("Pro"));

        String s2 = "java programming";
        System.out.println("Equals         : " + s.equals(s2));
        System.out.println("Ignore Case    : " + s.equalsIgnoreCase(s2));

        System.out.println("After Concat   : " + s.concat(" Language"));
    }
}
