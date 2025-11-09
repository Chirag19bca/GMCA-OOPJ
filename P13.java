
class Student13 {

    int marks = 90;
    static int collegeCode = 123;

    void show() {
        System.out.println(this.marks);
        System.out.println(collegeCode);
    }
}

public class P13 {

    public static void main(String[] args) {
        new Student13().show();
    }
}
