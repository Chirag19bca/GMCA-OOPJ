
interface Exam24 {

    boolean Pass(int mark);
}

interface Classify24 {

    String Division(int average);
}

class Result24 implements Exam24, Classify24 {

    public boolean Pass(int mark) {
        return mark >= 50;
    }

    public String Division(int avg) {
        if (avg >= 60) {
            return "First";
        } else if (avg >= 50) {
            return "Second";
        } else {
            return "No division";
    
        }}
}

public class P24 {

    public static void main(String[] args) {
        Result24 r = new Result24();
        System.out.println(r.Pass(55));
        System.out.println(r.Division(58));
    }
}
