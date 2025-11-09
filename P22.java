
class A22 {

    static int x = 10;
}

class B22 extends A22 {

    int x = 20;

    void display() {
        System.out.println(A22.x);
        System.out.println(this.x);
    }
}

public class P22 {

    public static void main(String[] args) {
        new B22().display();
    }
}
