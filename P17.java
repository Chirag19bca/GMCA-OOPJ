
class Circle17 {

    double radius;
    static int count;

    Circle17() {
        this(1);
        count++;
    }

    Circle17(double r) {
        radius = r;
    }
}

public class P17 {

    public static void main(String[] args) {
        new Circle17();
        new Circle17();
        new Circle17();
        System.out.println(Circle17.count);
    }
}
