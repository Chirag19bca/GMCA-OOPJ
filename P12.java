
class Student12 {

    int enrollNo;
    String name;
    String gender;
    int marks;
    static int count = 0;

    Student12() {
        this(0, "Unknown", "N/A", 0);
    }

    Student12(int e, String n, String g, int m) {
        enrollNo = e;
        name = n;
        gender = g;
        marks = m;
        count++;
    }

    void display() {
        System.out.println(enrollNo + " " + name + " " + gender + " " + marks);
    }
}

public class P12 {

    public static void main(String[] args) {
        Student12 s1 = new Student12(1, "Arun", "M", 80);
        Student12 s2 = new Student12(2, "Hiren", "M", 70);
        s1.display();
        s2.display();
        System.out.println(Student12.count);
    }
}
