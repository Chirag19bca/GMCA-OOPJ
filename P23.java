
abstract class Shape23 {

    abstract double area();
}

class Triangle23 extends Shape23 {

    double b, h;

    Triangle23(double b, double h) {
        this.b = b;
        this.h = h;
    }

    double area() {
        return 0.5 * b * h;
    }
}

class Rectangle23 extends Shape23 {

    double l, w;

    Rectangle23(double l, double w) {
        this.l = l;
        this.w = w;
    }

    double area() {
        return l * w;
    }
}

class Circle23 extends Shape23 {

    double r;

    Circle23(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }
}

public class P23 {

    public static void main(String[] args) {
        Shape23 t = new Triangle23(10, 5);
        Shape23 r = new Rectangle23(4, 6);
        Shape23 c = new Circle23(3);
        System.out.println(t.area());
        System.out.println(r.area());
        System.out.println(c.area());
    }
}
