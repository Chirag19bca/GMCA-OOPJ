// Generic class Number_1 that works for int and float
class Number_1<T extends Number> {
    private T value;

    Number_1(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double toDouble() {
        return value.doubleValue();
    }
}

public class P27 {
    public static void main(String[] args) {

        Number_1<Integer> intObj = new Number_1<>(10);
        Number_1<Float> floatObj = new Number_1<>(12.5f);

        System.out.println("Integer value: " + intObj.getValue());
        System.out.println("As double    : " + intObj.toDouble());

        System.out.println("Float value  : " + floatObj.getValue());
        System.out.println("As double    : " + floatObj.toDouble());
    }
}
