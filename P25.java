import student.Student;
import exam.Result;
public class P25 {
    public static void main(String[] args){
        Student s = new Student("Arun", 85);
        Result.printMarksheet(s);
    }
}