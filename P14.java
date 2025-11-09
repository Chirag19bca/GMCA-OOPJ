
class Rectangle14 {

    int length, width;
    static int count;

    static {
        count = 0;
    }


    Rectangle14() {
        this(1, 1);
    }

    Rectangle14(int l, int w) {
        length = l;
        width = w;
        count++;
    }

    Rectangle14(Rectangle14 r) {
        this(r.length, r.width);
    }

    int area() {
        return length * width;
    }

    void display() {
        System.out.println(length + " " + width + " " + area());
    }
}

public class P14 {

    public static void main(String[] args) {
        Rectangle14 r1 = new Rectangle14();
        Rectangle14 r2 = new Rectangle14(4, 5);
        Rectangle14 r3 = new Rectangle14(r2);
        r1.display();
        r2.display();
        r3.display();
        System.out.println(Rectangle14.count);
    }
}
