
class Vehicle18 {

    String vehicle_type;

    Vehicle18(String t) {
        vehicle_type = t;
    }

    void display() {
        System.out.println(vehicle_type);
    }
}

class Car18 extends Vehicle18 {

    String model_type, company;

    Car18(String t, String m, String c) {
        super(t);
        model_type = m;
        company = c;
    }

    void display() {
        super.display();
        System.out.println(model_type + " " + company);
    }
}

public class P18 {

    public static void main(String[] args) {
        new Car18("Car", "Sedan", "Toyota").display();
    }
}
