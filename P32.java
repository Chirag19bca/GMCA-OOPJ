public class P32 {

    static void test(int x) throws Exception {
        if (x == 1) throw new ArithmeticException("Arithmetic Exception");
        if (x == 2) throw new NullPointerException("Null Pointer Exception");
        if (x == 3) throw new Exception("General Exception");
    }

    public static void main(String[] args) {

        // try block with multiple catch + finally
        try {
            test(1); // change 1/2/3/4 to test
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }

        // second independent try block
        try {
            int a = 10, b = 0;
            if (b == 0)
                throw new ArithmeticException("Cannot divide by zero");
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Second Try Caught: " + e.getMessage());
        }
    }
}
