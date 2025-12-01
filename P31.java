// User defined exception for divide by zero
class DivideByZeroException extends Exception {
    DivideByZeroException(String m) {
        super(m);
    }
}

public class P31 {
    static int divide(int a, int b) throws DivideByZeroException {
        if (b == 0)
            throw new DivideByZeroException("Cannot divide by zero!");
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (DivideByZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
