// final class cannot be inherited
final class FinalClass {
    final double PI = 3.14159; // final variable

    final void show() { // final method
        System.out.println("PI = " + PI);
    }
}

public class P30 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();

        final int x = 100;
        System.out.println("Final local variable x = " + x);
    }
}
